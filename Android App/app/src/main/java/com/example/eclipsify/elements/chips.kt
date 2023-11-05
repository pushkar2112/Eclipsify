package com.example.eclipsify.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.R
import com.google.android.material.chip.Chip


@Composable
fun home() {
    var isSelected by remember {
        mutableStateOf(false)
    }
    AssistChip(modifier = Modifier
        .padding(start = 9.dp, top = 32.dp)
        .size(70.dp, 25.dp),onClick = { /*TODO*/ },
        label = { Text(text = "Home", modifier = Modifier.padding(start = 1.dp, bottom = 2.dp), color = Color.White, fontSize = 9.sp, fontFamily = FontFamily(
        Font(R.font.leextrabold)
    )) }, colors = AssistChipDefaults.assistChipColors(containerColor = Color.White.copy(0.1f)), border = null)


}

@Composable
fun quiz(navController: NavHostController) {
    var isSelected by remember {
        mutableStateOf(false)
    }
    AssistChip(modifier = Modifier
        .padding(start = 7.dp, top = 32.dp)
        .size(80.dp, 25.dp).wrapContentSize(Alignment.Center),onClick = {navController.navigate("WhatQuiz")  },
        label = { Text(text = "Quiz", modifier = Modifier.padding(start = 1.dp, bottom = 2.dp), color = Color.White, fontSize = 9.sp, fontFamily = FontFamily(
            Font(R.font.leextrabold)
        )) }, colors = AssistChipDefaults.assistChipColors(containerColor = Color.White.copy(0.1f)), border = null)


}

@Composable
fun safety(navController: NavHostController) {
    var isSelected by remember {
        mutableStateOf(false)
    }
    AssistChip(modifier = Modifier
        .padding(start = 7.dp, top = 32.dp)
        .size(150.dp, 25.dp).wrapContentSize(Alignment.Center),onClick = { navController.navigate("SafetyPrecautions") },
        label = { Text(text = "Safety Precautions", modifier = Modifier.padding(start = 0.dp, bottom = 2.dp), color = Color.White, fontSize = 9.sp, fontFamily = FontFamily(
            Font(R.font.leextrabold)
        )) }, colors = AssistChipDefaults.assistChipColors(containerColor = Color.White.copy(0.1f)), border = null)


}
@Composable
fun videos(navController: NavHostController) {
    var isSelected by remember {
        mutableStateOf(false)
    }
    AssistChip(modifier = Modifier
        .padding(start = 7.dp, top = 32.dp)
        .size(70.dp, 25.dp),onClick = { navController.navigate("CommunitySection") },
        label = { Text(text = "AR", modifier = Modifier.padding(start = 0.dp, bottom = 2.dp), color = Color.White, fontSize = 9.sp, fontFamily = FontFamily(
            Font(R.font.leextrabold)
        )) }, colors = AssistChipDefaults.assistChipColors(containerColor = Color.White.copy(0.1f)), border = null)


}


