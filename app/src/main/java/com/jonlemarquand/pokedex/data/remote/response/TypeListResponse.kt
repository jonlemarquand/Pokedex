package com.jonlemarquand.pokedex.data.remote.response

import com.jonlemarquand.pokedex.data.remote.dto.NamedApiResourceDto

data class TypeListResponse(
    val results: List<NamedApiResourceDto>
)