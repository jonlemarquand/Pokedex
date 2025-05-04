package com.jonlemarquand.pokedex.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.jonlemarquand.pokedex.data.local.AppDatabase
import com.jonlemarquand.pokedex.data.local.dao.PokemonDao
import com.jonlemarquand.pokedex.data.local.dao.TypeDao
import com.jonlemarquand.pokedex.data.remote.PokeApiService
import com.jonlemarquand.pokedex.data.repository.TypeRepositoryImpl
import com.jonlemarquand.pokedex.domain.repository.TypeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePokeApi(): PokeApiService {
        return Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .build()
            .create(PokeApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideTypeRepository(api: PokeApiService, app: Application): TypeRepository {
        return TypeRepositoryImpl(api, app)
    }

    @Provides
    fun provideDataBase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "App.db"
        ).build()
    }

    @Provides
    @Singleton
    fun providePokemonDao(database: AppDatabase): PokemonDao = database.pokemonDao()

    @Provides
    @Singleton
    fun provideTypeDao(database: AppDatabase): TypeDao = database.typeDao()
}