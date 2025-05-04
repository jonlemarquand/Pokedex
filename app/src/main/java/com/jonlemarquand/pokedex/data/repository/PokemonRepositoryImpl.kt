package com.jonlemarquand.pokedex.data.repository

import com.jonlemarquand.pokedex.data.local.dao.PokemonDao
import com.jonlemarquand.pokedex.data.remote.PokeApiService
import com.jonlemarquand.pokedex.domain.model.Pokemon
import com.jonlemarquand.pokedex.domain.model.Type
import com.jonlemarquand.pokedex.domain.repository.PokemonRepository

class PokemonRepositoryImpl(
    private val api: PokeApiService,
    private val dao: PokemonDao
) : PokemonRepository {
    override suspend fun getPokemonByType(type: Type): List<Pokemon> {
        val local = dao.getAll()
        return if (local.isNotEmpty()) {
            local.map { it.toDomain() }
        } else {
            val response = api.getElectricType()
            val pokemon = response.pokemon.map { it.pokemon.toDomain() }
            dao.insertAll(pokemon.map { it.toEntity() })
            pokemon
        }
    }
}