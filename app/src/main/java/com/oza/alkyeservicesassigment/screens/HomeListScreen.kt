package com.oza.alkyeservicesassigment.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.oza.alkyeservicesassigment.R
import com.oza.alkyeservicesassigment.Screen


@Composable
fun HomeListScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            HorizontalList(navController)
        }
        VerticalList(navController)
        item {
            HorizontalList(navController)
        }
    }
}


@Composable
fun HorizontalList(navController: NavController) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(10) {
            Card(
                modifier = Modifier.padding(5.dp).background(Color.White),
                shape = RoundedCornerShape(10),
                onClick = {
                    navController.navigate(Screen.DetailScreen.route + "/$it")
                }
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.car), contentDescription = "Car", modifier = Modifier.fillMaxSize())
                    Text(text = "Step Into Tomorrow")
                }
            }
        }
    }
}


fun LazyListScope.VerticalList(navController: NavController) {
    items(15) { it ->
        Card(
            modifier = Modifier.fillMaxWidth().padding(5.dp).background(Color.White),
            onClick = {
                navController.navigate(Screen.DetailScreen.route + "/$it")
            }
            ) {
            Row {
                Image(painter = painterResource(id = R.drawable.car), contentDescription = "Car")
                Text(text = "Step Into Tomorrow item: $it")
            }
        }
    }
}