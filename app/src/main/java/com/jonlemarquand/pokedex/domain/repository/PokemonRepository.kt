package com.jonlemarquand.pokedex.domain.repository

import com.jonlemarquand.pokedex.domain.model.Pokemon
import com.jonlemarquand.pokedex.domain.model.Type

interface PokemonRepository {
    suspend fun getPokemonByType(type: Type): List<Pokemon>
}