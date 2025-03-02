package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.td),
            contentDescription = "Profile Picture",
            modifier = Modifier.size(120.dp).clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Никита Шиляев", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "Группа: CS-304", fontSize = 18.sp, color = MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "nikita.email@example.com", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "🏀 Люблю играть в баскетбол и смотреть фильмы",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}
