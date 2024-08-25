package com.oza.alkyeservicesassigment.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import com.oza.alkyeservicesassigment.R
import com.oza.alkyeservicesassigment.ui.theme.strawfordFontFamily

@Composable
fun TvScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.app_bg)),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(text = "TV Screen", fontSize = 22.sp, modifier = Modifier.fillMaxSize(), fontFamily = strawfordFontFamily)
    }
}