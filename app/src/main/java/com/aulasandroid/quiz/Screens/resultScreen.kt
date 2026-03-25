package com.aulasandroid.quiz.Screens

import android.R.attr.onClick
import android.R.attr.text
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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.quiz.R

@Composable
fun resultScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
            .background(Color(113, 239, 180, 255)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(40.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Logo",
            modifier = modifier.size(60.dp)
        )

        Row(
            modifier = Modifier
                .background(Color(242, 141, 202, 255),
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
                text = "Bom trabalho!",
            )
        }

        Text( text = "Você acertou 1 de 3 perguntas")

        Button(
            onClick = {},
            modifier = Modifier
                .width(250.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(22.dp)
                ),
            colors = ButtonDefaults.buttonColors(
                Color(100,200,200)
            )
        ) {
             Text(
                modifier = Modifier.fillMaxWidth()
                    .padding(5.dp),
                text = "Jogar Novamente",
                fontSize = 20.sp,
                 textAlign = TextAlign.Center
            )
        }
    }

}