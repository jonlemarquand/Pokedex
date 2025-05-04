package com.jonlemarquand.pokedex.presentation

// Navigation.kt
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jonlemarquand.pokedex.presentation.type.TypesScreen


@Composable
fun PokedexApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("types") { TypesScreen(navController) }
    }
}
