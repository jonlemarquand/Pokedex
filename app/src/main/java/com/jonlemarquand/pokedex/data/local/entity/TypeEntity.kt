package com.jonlemarquand.pokedex.data.local.entity

@Entity(tableName = "type")
data class TypeEntity(
    @PrimaryKey val name: String,
    val url: String
)