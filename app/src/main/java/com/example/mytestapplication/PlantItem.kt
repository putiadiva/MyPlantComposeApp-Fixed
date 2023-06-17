package com.example.mytestapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mytestapplication.ui.theme.MyTestApplicationTheme

@Composable
fun PlantItem(
    id: Long,
    image: Int,
    name: String,
    sciName: String,
    navController: NavController?
) {
    Card(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable { navController!!.navigate(Screen.DetailPlant.createRoute(id)) }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = image),
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
            )
            Column(
                modifier = Modifier.padding(8.dp, 0.dp)
            ) {
                Text(text = name, fontSize = 24.sp)
                Text(text = sciName, fontStyle = FontStyle.Italic)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PlantItemPreview() {
    MyTestApplicationTheme {
        PlantItem(
            id = 1L,
            image = R.drawable.aglaonema,
            name = "Dummy Name",
            sciName = "Dummy Sci Name",
            navController = null
        )
    }
}
