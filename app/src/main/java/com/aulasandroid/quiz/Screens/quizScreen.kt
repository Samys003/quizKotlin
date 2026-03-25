package com.aulasandroid.quiz.Screens

import android.R.attr.onClick
import android.R.attr.text
import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.aulasandroid.quiz.R


@Composable
fun quizScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
            .background(color = Color(234, 27, 123, 255)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Logo",
            modifier = Modifier.size(80.dp)
        )
        Row(
            modifier = Modifier
                .background(Color(234, 208, 59, 255),
                    shape = RoundedCornerShape(12.dp))
                .height(50.dp)
                .width(200.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(12.dp)
                ),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Pergunta 1 de 3",
            )
        }

        Card(
            modifier = Modifier
                .background(Color.White,
                    shape = RoundedCornerShape(12.dp))
                .size(320.dp)
                .padding(10.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
                    .background(Color.White),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Nome do ator que interpreta o Patrick? (10 coisas que eu odeio em você)",
                    textAlign = TextAlign.Center
                )
                Button(
                    modifier = Modifier.fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(12.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    onClick = {}
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth()
                            .padding(vertical = 0.dp),
                        text = "David Krumholtz",
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )
                }
                Button(
                    modifier = Modifier.fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(12.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    onClick = {}
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Heath Ledger",
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )
                }
                Button(
                    modifier = Modifier.fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(12.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    onClick = {}
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Tom Hansem",
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )
                }
                Button(
                    modifier = Modifier.fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(12.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    onClick = {}
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Benjamin Barry",
                        color = Color.Black,
                        textAlign = TextAlign.Start
                    )
                }
            }
         }
    }
}