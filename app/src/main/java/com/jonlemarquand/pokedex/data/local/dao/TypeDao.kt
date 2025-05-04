package com.jonlemarquand.pokedex.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jonlemarquand.pokedex.data.local.entity.PokemonEntity
import com.jonlemarquand.pokedex.data.local.entity.TypeEntity

@Dao
interface TypeDao {
    @Query("SELECT * FROM type")
    suspend fun getAll(): List<TypeEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(type: List<TypeEntity>)
}