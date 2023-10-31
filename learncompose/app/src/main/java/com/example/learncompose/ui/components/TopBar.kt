package com.example.learncompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learncompose.R

@Composable
fun TopBar(value: String){
    Row (modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
        Text(text = value, color = Color.Blue, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier= Modifier.size(50.dp),
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "image"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar("Hi There \uD83D\uDE0A")
}