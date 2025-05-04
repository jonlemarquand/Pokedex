package com.jonlemarquand.pokedex.data.mapper

import com.jonlemarquand.pokedex.data.local.entity.TypeEntity
import com.jonlemarquand.pokedex.domain.model.Type

fun TypeEntity.toDomain(): Type =
    Type(
        id = TODO(),
        name = TODO(),
        color = TODO(),
        fadedColor = TODO(),
        icon = TODO()
    )

fun Type.toEntity(): TypeEntity =
    TypeEntity(name = name, url = url)