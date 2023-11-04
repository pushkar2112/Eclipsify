package com.example.eclipsify.myths.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eclipsify.R
import com.example.eclipsify.myths.models.Quote


@Composable
fun     QuoteListItem(quote: Quote) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Transparent)) {
        Box(modifier = Modifier.padding(top = 1.dp)) {
            Text(
                text = "Myth",
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(25.dp, 16.5.dp)
            )
        }
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            border = BorderStroke(1.dp, Color(0xFFCCCCCC)), colors = CardDefaults.cardColors(
                colorResource(id = R.color.blueAcc)),
            content = {

                (
                        Text(
                            text = quote.Myth,
                            modifier = Modifier.padding(16.dp), color = Color.White,
                            style = MaterialTheme.typography.bodyMedium
                        )

                        )
            }

        )
        Box(modifier = Modifier.padding()) {
            Text(
                text = "Reality",
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(335.dp, 16.5.dp)
            )
        }
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            border = BorderStroke(1.dp, Color(0xFFCCCCCC)),colors = CardDefaults.cardColors(
                colorResource(id = R.color.blueAcc)),
            content = {

                (
                        Text(
                            text = quote.Reality,
                            modifier = Modifier.padding(16.dp), color = Color.White,
                            style = MaterialTheme.typography.bodyMedium
                        )

                        )
            }

        )
    }

}






