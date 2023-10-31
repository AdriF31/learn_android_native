package com.example.learncompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AnimalCard(animalValue: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .size(200.dp)
            .padding(16.dp)
            .clickable(onClick = { onClick })
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center,
        ) {
            TextComponent(textValue = animalValue, textSize = 24.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnimalCardPreview() {
    AnimalCard("Kucing", onClick = {
        print("hehehehe")
    })
}