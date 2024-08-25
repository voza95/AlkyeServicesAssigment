package com.oza.alkyeservicesassigment.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.oza.alkyeservicesassigment.R

@Composable
fun DetailScreen(navController: NavHostController, id: Int?) {
    Column {
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.back_arrow),
            contentDescription = "Back button",
            modifier = Modifier.size(50.dp).padding(20.dp).clickable { navController.popBackStack() })
        Image(
            modifier = Modifier.fillMaxWidth().height(150.dp),
            painter = painterResource(id = R.drawable.car),
            contentDescription = "Car")
    }
}