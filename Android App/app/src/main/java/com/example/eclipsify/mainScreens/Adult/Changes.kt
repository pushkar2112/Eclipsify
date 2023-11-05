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

    Text(text= "Eclipses are natural celestial events.On Earth, there are two main types of eclipses: solar eclipses and lunar eclipses. Each type of eclipse brings about unique changes and effects on our planet. Here's how these changes occur:",
        color = Color.White, fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.popreg)),
        modifier = Modifier.padding(top = 18.dp, start = 21.dp,end=21.dp),
        textAlign = TextAlign.Justify)


    ChangeScroll(changeSolar = changeSolar)
}

    }

}

val changeSolar= listOf(
    Change("Darkening of the moon", "During a lunar eclipse, the moon passes into the Earth's shadow. It does not disappear but takes on a reddish hue as sunlight is refracted through the Earth's atmosphere onto its surface."),
    Change("Visibility of earth's atmosphere", "The sunlight refracted onto the eclipsed moon allows viewing of the earth's atmosphere in action, sometimes making the moon appear to glow red, orange or deep coppery brown."),
    Change("Changes in moonrise and moonset times", "The moon's orbit is elliptical, so rise and set times vary. Eclipses occur when orbital positions align just right with the sun and earth."),
    Change("Physiological effects", "Some people report similar symptoms as a solar eclipse like nausea or dizziness due to changes in light levels and appearance of the sky, though less dramatically than a solar eclipse."),
    Change("Effects on tides", "The moon's gravitational pull is responsible for ocean tides. During an eclipse when the moon passes through the earth's shadow, its gravitational influence is reduced slightly, resulting in smaller tidal ranges."),
    Change("Shadow bands", "Similar to a solar eclipse, shadow bands can sometimes be seen radiating outwards from the moon as earth's shadow approaches or recedes during the eclipse."),
    Change("Impact on nocturnal animals", "Some animals may become more active than usual as the moon darkens, mistaking it for nightfall. Others seem to take no notice of the change."),
    Change("Cultural and spiritual significance", "Many ancient cultures attached mythological or spiritual meanings to lunar eclipses, seeing them as omens. Some modern cultures still hold special beliefs or traditions associated with eclipses."),
    Change("Opportunity for astronomy", "A lunar eclipse provides a great chance to observe the moon through a telescope, sometimes seeing additional colors or details not visible at other times. It also allows viewing stars and planets near the moon."),
    Change("Visual effects", "As the moon passes through different parts of the earth's shadow, its illumination changes from partial to near total darkness and back again, presenting a visually dramatic event in the night sky.")
)
data class Change(val head:String,val info:String)
@Composable

fun ChangeCard(change: Change){
    Card(
        Modifier

            .padding(end = 20.dp)
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
