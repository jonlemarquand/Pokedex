package com.jonlemarquand.pokedex.data.remote

import com.jonlemarquand.pokedex.data.model.PokemonDto
import com.jonlemarquand.pokedex.data.model.TypeDto
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApiService {
    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path("name") name: String): PokemonDto

    @GET("type")
    suspend fun getAllTypes(): TypeDto

    @GET("type/{name}")
    suspend fun getPokemonByType(@Path("name") name: String): TypeDto
}