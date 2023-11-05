package com.example.eclipsify.mainScreens.Adult

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.R


@Composable
fun SolarChangesScreen(navController: NavHostController) {
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
    Text(text = "Effect Of",
        color = colorResource(id = R.color.white),
        fontSize = 27.sp,
        fontFamily = FontFamily(Font(R.font.akirabold)),
        modifier = Modifier
            .padding(start = 21.dp, top = 15.dp)
    )
    Row {
        Text(text = "Solar",
            color = colorResource(id = R.color.orange),
            fontSize = 27.sp,
            fontFamily = FontFamily(Font(R.font.akirabold)),
            modifier = Modifier
                .padding(start = 21.dp, top = 1.dp)
        )
        Text(text = "Eclipse",
            color = Color.White,
            fontSize = 27.sp,
            fontFamily = FontFamily(Font(R.font.akirabold)),
            modifier = Modifier
                .padding(top = 1.dp)
                .offset(8.dp)
        )
    }

    Text(text= "During solar eclipses, Earth experiences temporary darkness in the path of totality, a noticeable temperature drop due to reduced sunlight, potential changes in animal behavior, and the creation of unique lighting patterns and crescent-shaped shadows.",
        color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
        modifier = Modifier.padding(top = 18.dp, start = 21.dp,end=21.dp),
        textAlign = TextAlign.Justify)


    ChangeScroll(changeSolar = changeSolar)
}

    }

}

val changeSolar= listOf(
    Change("Darkening of the sky", "During a solar eclipse, the moon passes between the sun and earth, blocking the sun's light and darkening the sky. The sky takes on an eerie twilight appearance."),
    Change("Visibility of solar corona", "As the moon blocks the sun's bright face, it allows viewing of the sun's much fainter outer atmosphere called the solar corona."),
    Change("Reduction in temperature", "With less direct sunlight reaching the earth's surface, temperatures drop noticeably during the eclipse. Reports show drops as much as 3-5 degrees Celsius."),
    Change("Changes in animal behavior", "Many animals seem disturbed and confused by the unusual darkening of the day. Birds may return to their nests, and nocturnal animals sometimes emerge earlier than usual."),
    Change("Effects on plants", "Some plants are reported to close their leaves or flowers temporarily in response to the dimming of light levels during a solar eclipse."),
    Change("Visual effects on the eclipsed sun", "As the moon covers different portions of the sun, the shape of the remaining sun appears to change, going from crescent to bite out of a cookie to thin crescent again."),
    Change("Shadow bands effect", "Ripples of shadow may be seen sweeping across the landscape moments before and after totality as the moon's shadow approaches and recedes from an observer's location."),
    Change("Coronal mass ejections", "Large eruptions of plasma and magnetic fields can be released from the sun's corona during an eclipse, potentially impacting Earth's magnetic field and satellite/power systems."),
    Change("Physiological effects on people", "Some report nausea, dizziness or other symptoms as a response to the rapid dimming and changing light levels during an eclipse. Eye damage can occur if looking directly at the sun without proper eye protection."),
    Change("Reddening of sunlight", "As sunlight passes through the Earth's atmosphere near the horizon during totality, air molecules scatter blue light while red wavelengths continue straight, giving the sun a red hue.")
)
data class Change(val head:String,val info:String)
@Composable

fun ChangeCard(change: Change){
    Card(
        Modifier

            .padding(end = 20.dp, bottom = 40.dp)
            .offset(10.dp), shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp, bottomStart = 18.dp, bottomEnd = 18.dp),colors = CardDefaults.cardColors(colorResource(id = R.color.trans))) {

        Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
            Text(
                text =change.head , modifier = Modifier
                    .width(250.dp)
                    .padding(start = 20.dp, top = 10.dp)
                    .wrapContentSize(Alignment.Center),color = colorResource(id = R.color.orange),
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text =change.info , modifier = Modifier
                    .width(250.dp)
                    .padding(start = 20.dp, top = 10.dp)
                    .wrapContentSize(Alignment.TopStart),color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.popreg)),
                fontWeight = FontWeight.SemiBold
            )


        }
    }
}


@Composable
fun ChangeScroll(changeSolar: List<Change>) {
    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp))
    {
        items(changeSolar) { change->
            ChangeCard(change)
        }
    }

}
