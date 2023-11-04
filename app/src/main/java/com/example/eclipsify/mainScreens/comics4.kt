package com.example.eclipsify.mainScreens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.eclipsify.R
import com.example.eclipsify.mainScreens.child.back

@Composable
fun commm4(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.finalkid), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop )
        back(navController)
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 40.dp)
            .background(
                color = colorResource(
                    id = R.color.trans
                )
            )
            .verticalScroll(state = rememberScrollState()))
        {
            Image(painter = painterResource(id = R.drawable.safer), contentDescription ="", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop, )
        }
    }


}