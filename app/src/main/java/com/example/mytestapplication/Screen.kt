package com.example.mytestapplication

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object DetailPlant : Screen("home/{plantId}") {
        fun createRoute(plantId: Long) = "home/$plantId"
    }
    object About : Screen("about")
}