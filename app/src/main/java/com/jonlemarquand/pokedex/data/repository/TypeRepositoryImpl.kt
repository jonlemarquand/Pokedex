package com.jonlemarquand.pokedex.data.repository

import com.jonlemarquand.pokedex.data.local.dao.PokemonDao
import com.jonlemarquand.pokedex.data.local.dao.TypeDao
import com.jonlemarquand.pokedex.data.local.entity.TypeEntity
import com.jonlemarquand.pokedex.data.remote.PokeApiService
import com.jonlemarquand.pokedex.data.static.baseTypeList
import com.jonlemarquand.pokedex.domain.model.Pokemon
import com.jonlemarquand.pokedex.domain.model.Type
import com.jonlemarquand.pokedex.domain.repository.TypeRepository
import utils.extensions.toLong

class TypeRepositoryImpl(
    private val api: PokeApiService,
    private val typeDao: TypeDao,
    private val pokemonDao: PokemonDao
): TypeRepository {
    override suspend fun getAllTypes() {
        val response = api.getAllTypes() // GET /type
        val mappedTypes = response.results.mapNotNull { dto ->
            val id = dto.url.trimEnd('/').split("/").last().toIntOrNull()
            val match = baseTypeList.find { it.name.equals(dto.name, ignoreCase = true) }

            if (id != null && match != null) {
                TypeEntity(
                    id = id,
                    name = dto.name.replaceFirstChar { it.uppercase() },
                    colorInt = match.color.toLong(),
                    fadedColorInt = match.fadedColor.toLong(),
                    iconResId = match.icon
                )
            } else null // Skip unknown/missing mappings
        }

        typeDao.insertAll(mappedTypes)
    }
}