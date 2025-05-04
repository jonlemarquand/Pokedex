package com.jonlemarquand.pokedex.domain.repository

import com.jonlemarquand.pokedex.domain.model.Pokemon
import com.jonlemarquand.pokedex.domain.model.Type

interface TypeRepository {
    suspend fun getPokemonByType(type: Type): List<Pokemon>
}