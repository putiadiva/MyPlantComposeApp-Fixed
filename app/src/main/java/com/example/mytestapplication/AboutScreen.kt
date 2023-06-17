package com.example.mytestapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytestapplication.ui.theme.MyTestApplicationTheme

@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_photo),
            contentDescription = null,
            modifier = Modifier
                .size(240.dp)
                .clip(shape = RoundedCornerShape(240.dp))
        )
        Text(text = "Puti Adiva", fontSize = 28.sp, modifier = Modifier.padding(top = 20.dp))
        Text(text = "A181DSY1076")
        Text(text = "Bangkit Academy 2023")
        Text(text = "a181dsy1076@bangkit.academy")
        Text(text = "adiva.puti@gmail.com")
    }
}

@Composable
@Preview
fun AboutScreenPreview() {
    MyTestApplicationTheme {
        AboutScreen()
    }
}