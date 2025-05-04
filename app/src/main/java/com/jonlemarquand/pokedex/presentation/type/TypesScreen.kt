package com.jonlemarquand.pokedex.presentation.type

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jonlemarquand.pokedex.domain.utils.Type
import com.jonlemarquand.pokedex.domain.utils.typesList
import com.jonlemarquand.pokedex.presentation.components.ButtonWithBackground
import com.jonlemarquand.pokedex.presentation.components.DoubleColumnList
import com.jonlemarquand.pokedex.presentation.ui.theme.BackgroundGrey
import com.jonlemarquand.pokedex.presentation.ui.theme.PokedexTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TypesScreen(navController: NavController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Types") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(color = BackgroundGrey)
            ) {
                SearchBar(
                    placeholder = { "Search" },
                    query = "",
                    onQueryChange = { /*TODO*/ },
                    onSearch = { /*TODO*/ },
                    active = false,
                    onActiveChange = { /*TODO*/ }
                ) {

                }
                DoubleColumnList(
                    typesList,
                    itemContent = { type, modifier ->
                        TypesListItem(type = type, modifier = modifier)
                    }
                )
            }
        }
    )
}

@Composable
fun TypesListItem(type: Type, modifier: Modifier) {
    Column(modifier = modifier) {
        ButtonWithBackground(
            buttonText = type.name,
            buttonColor = type.color,
            buttonIcon = type.icon,
            buttonIconColor = type.fadedColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TypesScreenPreview() {
    val navController = rememberNavController()
    PokedexTheme {
        TypesScreen(navController)
    }
}