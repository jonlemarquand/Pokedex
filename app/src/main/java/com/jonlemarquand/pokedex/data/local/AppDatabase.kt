package com.jonlemarquand.pokedex.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jonlemarquand.pokedex.data.local.dao.PokemonDao
import com.jonlemarquand.pokedex.data.local.dao.TypeDao
import com.jonlemarquand.pokedex.domain.model.Pokemon
import com.jonlemarquand.pokedex.domain.model.Type

@Database(
    entities = [Pokemon::class, Type::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun pokemonDao(): PokemonDao
    abstract fun typeDao(): TypeDao
}