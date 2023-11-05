package com.example.eclipsify.mainScreens.Adult

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.R


@Composable
fun ChangesScreen(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black))
    {
        Image(painter = painterResource(id = R.drawable.gp), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop )

Column(
    Modifier
        .fillMaxSize()
        .verticalScroll(state = rememberScrollState())) {

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, top = 30.dp, end = 10.dp)
        .wrapContentHeight(), colors = CardDefaults.cardColors(colorResource(id = R.color.trans))){
        Image(painter = painterResource(id = R.drawable.earth2), contentDescription ="",
            Modifier
                .fillMaxSize()
                .padding(5.dp), contentScale = ContentScale.Crop)

    }
    Row {
        Text(text = "Effects",
            color = colorResource(id = R.color.orange),
            fontSize = 27.sp,
            fontFamily = FontFamily(Font(R.font.akirabold)),
            modifier = Modifier
                .padding(start = 21.dp, top = 31.dp)
        )
        Text(text = "On Us  ",
            color = Color.White,
            fontSize = 27.sp,
            fontFamily = FontFamily(Font(R.font.akirabold)),
            modifier = Modifier
                .padding(top = 31.dp)
                .offset(8.dp)
        )



    }
    Text(text= "Eclipses are natural celestial events.On Earth, there are two main types of eclipses: solar eclipses and lunar eclipses. Each type of eclipse brings about unique changes and effects on our planet. Here's how these changes occur:",
        color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
        modifier = Modifier.padding(top = 18.dp, start = 21.dp,end=21.dp),
        textAlign = TextAlign.Justify)

    typesCarousel(navController)
}
    }

}


