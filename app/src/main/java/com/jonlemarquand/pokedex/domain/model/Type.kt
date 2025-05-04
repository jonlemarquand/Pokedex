package com.jonlemarquand.pokedex.domain.model

data class Type(
    val id: Int,
    val name: String,
    val pokemon: List<Pokemon>
)