package com.jonlemarquand.pokedex.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jonlemarquand.pokedex.presentation.ui.theme.PokedexTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Hello!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PokedexTheme {
        HomeScreen()
    }
}