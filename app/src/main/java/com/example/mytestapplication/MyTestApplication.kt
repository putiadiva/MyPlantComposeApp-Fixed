package com.example.mytestapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTestApplication() {
    val navController: NavHostController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "My Plant App") }, actions = {
                IconButton(onClick = { navController.navigate(Screen.About.route) }) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "about_page")
                }
            })
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController = navController)
            }
            composable(
                route = Screen.DetailPlant.route,
                arguments = listOf(navArgument("plantId") { type = NavType.LongType })
            ) {
                val id = it.arguments?.getLong("plantId") ?: -1L
                val plant = plantList[(id - 1).toInt()]
                DetailScreen(
                    plant = plant
                )
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
        }
    }
}