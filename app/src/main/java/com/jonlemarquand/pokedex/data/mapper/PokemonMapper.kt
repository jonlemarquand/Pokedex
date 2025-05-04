package com.jonlemarquand.pokedex.data.mapper

import com.jonlemarquand.pokedex.data.local.entity.PokemonEntity
import com.jonlemarquand.pokedex.domain.model.Pokemon

fun PokemonEntity.toDomain(): Pokemon =
    Pokemon(name = name, url = url)

fun Pokemon.toEntity(): PokemonEntity =
    PokemonEntity(name = name, url = url)