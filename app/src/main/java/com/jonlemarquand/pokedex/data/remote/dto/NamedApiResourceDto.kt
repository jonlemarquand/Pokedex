package com.jonlemarquand.pokedex.data.remote.dto

data class NamedApiResourceDto(
    val name: String,
    val url: String // Example: "https://pokeapi.co/api/v2/type/13/"
)