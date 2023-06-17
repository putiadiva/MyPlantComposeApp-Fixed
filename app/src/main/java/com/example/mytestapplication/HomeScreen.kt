package com.example.mytestapplication

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mytestapplication.ui.theme.MyTestApplicationTheme

@Composable
fun HomeScreen(
    navController: NavController?
) {
    PlantList(list = plantList, navController = navController)
}

@Composable
fun PlantList(
    list: List<Plant>,
    navController: NavController?
) {
    LazyColumn(
        contentPadding = PaddingValues(bottom = 8.dp)
    ) {
        items(list) { plant ->
            PlantItem(
                image = plant.photo,
                name = plant.name,
                sciName = plant.scientificName,
                navController = navController,
                id = plant.id
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    MyTestApplicationTheme {
        HomeScreen(navController = null)
    }
}