package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learncompose.ui.screens.LearnComposeNavigationGraph
import com.example.learncompose.ui.screens.Routes
import com.example.learncompose.ui.screens.UserInputScreen
import com.example.learncompose.ui.screens.WelcomeScreen
import com.example.learncompose.ui.theme.LearncomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearncomposeTheme {
                LearnComposeApp()
            }
        }
    }

    @Composable
    private fun LearnComposeApp() {
        LearnComposeNavigationGraph()
    }
}
