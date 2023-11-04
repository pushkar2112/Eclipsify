package com.example.eclipsify.mainScreens


import android.annotation.SuppressLint
import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.Pages
import com.example.eclipsify.R
import com.example.eclipsify.myths.DataManager
import com.example.eclipsify.myths.DataManager.data
import com.example.eclipsify.myths.models.Quote
import com.example.eclipsify.myths.screens.QuoteDetail
import com.example.eclipsify.myths.screens.QuoteList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Myth(navController: NavHostController) {
    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black))
    {
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
            ) {

        Image(painter = painterResource(id = R.drawable.mythmain),contentDescription ="", modifier = Modifier.fillMaxWidth() ,contentScale = ContentScale.FillWidth)
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="", modifier = Modifier
            .offset(15.dp, -270.dp)
            .clickable { navController.navigate("AdultPage") }, tint = Color.White)

        Row {
            Text(text = "Myth",
                color = colorResource(id = R.color.white),
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 15.dp, top = 31.dp)
            )
            Text(text = "vs",
                color = colorResource(id = R.color.orange),
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 4.dp, top = 31.dp)
            )
            Text(text = "Reality",
                color = Color.White,
                fontSize = 27.sp,
                fontFamily = FontFamily(Font(R.font.akirabold)),
                modifier = Modifier
                    .padding(start = 12.dp, top = 31.dp)
                    .offset(-6.dp)
            )
            Divider(
                color = colorResource(id = R.color.orange),
                modifier = Modifier.padding(top = 54.dp, end = 19.dp)
            )

        }
        Spacer(modifier = Modifier.height(21.dp))
        Column {
            CoroutineScope(Dispatchers.IO).launch {DataManager.loadAssetFromFile(context) }

            App()

        }




            Row {

                Text(text = "Suggested ",
                    color = colorResource(id = R.color.white),
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    modifier = Modifier
                        .padding(top = 31.dp)
                        .offset(15.dp)
                )
                Divider(
                    color = colorResource(id = R.color.orange),
                    modifier = Modifier.padding(start = 15.dp, top = 47.dp, end = 19.dp)
                )

            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.horizontalScroll(state = rememberScrollState())) {

                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp)
                        .clickable { navController.navigate("Upcoming") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans)
                    )
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.upcoming),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 30.dp, top = 21.dp)
                                .size(96.dp, 97.dp)
                        )
                        Text(
                            text = "Upcoming ",
                            color = colorResource(id = R.color.orange),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 22.dp, top = 22.dp)
                        )
                        Text(
                            text = "Eclipses",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 32.dp)
                        )


                    }

                }

                Card(modifier = Modifier
                    .size(170.dp, 200.dp)
                    .padding(start = 15.dp),
                    onClick = { navController.navigate("SolarEclipse") },
                    colors = CardDefaults.cardColors(colorResource(id = R.color.trans))
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.solar),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 7.dp, top = 4.dp)
                                .size(135.dp, 135.dp)
                        )
                        Text(
                            text = "Solar",
                            color = colorResource(id = R.color.orange),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 37.dp, top = 2.dp)
                        )
                        Text(
                            text = "Eclipses",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 19.5.dp)
                        )


                    }

                }
                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp)
                        .clickable { navController.navigate("LunarEclipse") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans)
                    )
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.lunar),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 29.dp, top = 21.dp)
                                .size(96.dp, 97.dp)
                        )
                        Text(
                            text = "Lunar",
                            color = colorResource(id = R.color.orange),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 37.dp, top = 22.dp)
                        )
                        Text(
                            text = "Eclipses",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 19.5.dp)
                        )


                    }

                }
                Card(
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(start = 15.dp, end = 8.dp)
                        .clickable { navController.navigate("WhatQuiz") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans)
                    )
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.facts),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 29.dp, top = 21.dp)
                                .size(96.dp, 97.dp)
                        )
                        Text(
                            text = "   Take ",
                            color = colorResource(id = R.color.orange),
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 12.dp, top = 22.dp)
                        )
                        Text(
                            text = "  Quiz",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.akirabold)),
                            modifier = Modifier.padding(start = 22.dp)
                        )


                    }

                }

            }
            Spacer(modifier = Modifier.height(20.dp))
        }




    }







@Composable
fun QuoteListScreen(data: Array<Quote>) {
    Column() {
        QuoteList(data = data )

    }

}


