package com.jonlemarquand.pokedex.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jonlemarquand.pokedex.data.local.entity.PokemonEntity

@Dao
interface TypeDao {
    @Query("SELECT * FROM electric_pokemon")
    suspend fun getAll(): List<PokemonEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(pokemon: List<PokemonEntity>)
}