package com.example.learncompose.ui.screens

import android.util.Log
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learncompose.data.UserDataUiEvents
import com.example.learncompose.ui.components.AnimalCard
import com.example.learncompose.ui.components.TextComponent
import com.example.learncompose.ui.components.TextFieldComponent
import com.example.learncompose.ui.components.TopBar
import com.example.learncompose.ui.components.UserInputViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {

    Scaffold (
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    TextComponent(textValue = "app bar", textSize = 16.sp)
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },

            )
        },
       content ={
           Column(
               modifier = Modifier
                   .fillMaxSize()
                   .padding(
                       bottom = it.calculateBottomPadding(),
                       top = it.calculateTopPadding(),
                       start = 16.dp,
                       end = 16.dp
                   )
           ) {
               TopBar(value = "Hi There \uD83D\uDE0A")
               TextComponent(
                   textValue = "Hello everyone",
                   textSize = 24.sp,
                   textColor = Color.Black,
                   fontWeight = FontWeight.Bold
               )
               Spacer(modifier = Modifier.size(24.dp))
               TextComponent(textValue = "Hello everyone", textSize = 16.sp, textColor = Color.Blue)
               Spacer(modifier = Modifier.size(60.dp))
               TextFieldComponent(
                   onTextChange = {
                       userInputViewModel.onEvent(UserDataUiEvents.UserNameEntered(it))
                   }
               )
               Spacer(modifier = Modifier.size(20.dp))
               Row (horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()){
                   AnimalCard("Anjing", onClick = {
                       Log.d("Anjing","Anjing")
                       print("sdadsdad")
                   })
                   AnimalCard("Kucing", onClick = {
                       Log.d("Kucing","Kucing")
                       Log.v("sdaassdad","sdsdsdsd")
                       print("sdasdasdsd")
                   })

               }

           }
       }

    )


}



@Preview
@Composable
fun UserScreenPreview(){
    UserInputScreen(UserInputViewModel())
}