package com.jonlemarquand.pokedex.data.local.entity

@Entity(tableName = "pokemon")
data class PokemonEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val sprite: String,
    val typeId: Int,
)