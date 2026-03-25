package com.aulasandroid.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aulasandroid.quiz.Screens.initScreen
import com.aulasandroid.quiz.Screens.quizScreen
import com.aulasandroid.quiz.Screens.resultScreen
import com.aulasandroid.quiz.ui.theme.QuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //initScreen(modifier = Modifier.padding(innerPadding),
                    //quizScreen(modifier = Modifier.padding(innerPadding)
                    resultScreen(modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}



