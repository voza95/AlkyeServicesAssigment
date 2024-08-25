package com.oza.alkyeservicesassigment.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TvScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(text = "TV", fontSize = 22.sp)
    }
}