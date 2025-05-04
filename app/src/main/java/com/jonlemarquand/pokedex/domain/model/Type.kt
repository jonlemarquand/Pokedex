package com.jonlemarquand.pokedex.domain.model

import androidx.compose.ui.graphics.Color

data class Type(
    val id: Int,
    val name: String,
    val color: Color,
    val fadedColor: Color,
    val icon: Int
)