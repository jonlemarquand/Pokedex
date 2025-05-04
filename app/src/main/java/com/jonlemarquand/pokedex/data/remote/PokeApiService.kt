package com.jonlemarquand.pokedex.data.remote

import com.jonlemarquand.pokedex.data.remote.dto.PokemonDto
import com.jonlemarquand.pokedex.data.remote.dto.TypeDto
import com.jonlemarquand.pokedex.data.remote.response.TypeListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApiService {
    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path("name") name: String): PokemonDto

    @GET("type")
    suspend fun getAllTypes(): TypeListResponse

    @GET("type/{name}")
    suspend fun getPokemonByType(@Path("name") name: String): TypeDto
}