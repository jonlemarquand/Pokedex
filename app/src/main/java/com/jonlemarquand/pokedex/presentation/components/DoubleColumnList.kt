package com.jonlemarquand.pokedex.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jonlemarquand.pokedex.domain.utils.typesList
import com.jonlemarquand.pokedex.presentation.type.TypesListItem
import com.jonlemarquand.pokedex.presentation.ui.theme.PokedexTheme

@Composable
fun <T> DoubleColumnList(
    itemList: List<T>, 
    itemContent: @Composable (T, Modifier) -> Unit
) {
    LazyColumn {
        items(itemList.chunked(2)) { pair ->
            Row(modifier = Modifier.padding(8.dp)) {
                itemContent(pair[0], Modifier.weight(1f))
                Spacer(modifier = Modifier.width(8.dp))
                if (pair.size > 1) {
                    itemContent(pair[1], Modifier.weight(1f))
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DoubleColumnListPreview() {
    PokedexTheme {
        DoubleColumnList(
            typesList,
            itemContent = { type, modifier ->
                TypesListItem(type = type, modifier = modifier)
            }
        )
    }
}