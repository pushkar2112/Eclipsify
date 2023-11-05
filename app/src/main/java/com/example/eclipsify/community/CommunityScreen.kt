package com.example.eclipsify.community

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eclipsify.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CommunityScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White) ){



        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(state = rememberScrollState())) {
            TopAppBar(backgroundColor = Color.White,
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
                title =
                {
                    Text(
                        text = "Feed",
                        modifier = Modifier.offset(80.dp),
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontFamily = FontFamily(
                            Font(R.font.lemedium)
                        )
                    )
                })
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(310.dp)
                .padding(2.dp), colors = CardDefaults.cardColors(Color.LightGray)) {
                Column(
                    Modifier
                        .padding(12.dp)
                        .fillMaxSize()) {
                    Row (Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                        Icon(Icons.Filled.AccountCircle, contentDescription ="",
                            Modifier
                                .padding(horizontal = 10.dp)
                                .size(30.dp) )
                        Text(text = "User", fontSize = 20.sp, fontFamily = FontFamily(Font(R.font.popreg)))

                    }
                    Image(painter = painterResource(id = R.drawable.pic1), contentDescription ="", modifier = Modifier.fillMaxWidth().fillMaxSize(0.9f), contentScale = ContentScale.Crop )
                    Row (Modifier.fillMaxWidth().padding(start=5.dp,top = 8.dp)){
                        Icon(Icons.Outlined.ThumbUp, contentDescription ="",Modifier.
                        fillMaxHeight() )

                    }

                }

            }





        }
    }

}