package com.oza.alkyeservicesassigment.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.oza.alkyeservicesassigment.R
import com.oza.alkyeservicesassigment.Screen

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    val item = listOf(
        BottomNavigationItem(
            title = Screen.HomeListScreen.route,
            selectedIcon = ImageVector.vectorResource(id = R.drawable.selected_book),
            unselectedIcon = ImageVector.vectorResource(id = R.drawable.unselected_book)
        ),
        BottomNavigationItem(
            title = Screen.BookmarkScreen.route,
            selectedIcon = ImageVector.vectorResource(id = R.drawable.selected_bookmark),
            unselectedIcon = ImageVector.vectorResource(id = R.drawable.unselected_bookmark)
        ),
        BottomNavigationItem(
            title = Screen.TvScreen.route,
            selectedIcon = ImageVector.vectorResource(id = R.drawable.selected_tv),
            unselectedIcon = ImageVector.vectorResource(id = R.drawable.unselected_tv)
        ),
        BottomNavigationItem(
            title = Screen.UserScreen.route,
            selectedIcon = ImageVector.vectorResource(id = R.drawable.selected_user),
            unselectedIcon = ImageVector.vectorResource(id = R.drawable.unselected_user)
        )
    )
    val scrollBehavior = BottomAppBarDefaults.exitAlwaysScrollBehavior()
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection).background(colorResource(R.color.app_bg)),
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .padding(40.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(Color.White),
                scrollBehavior = scrollBehavior
            ) {
                item.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItemIndex == index,
                        onClick = {
                            selectedItemIndex = index
                        },
                        icon = {
                            Icon(
                                imageVector = if (index == selectedItemIndex) {
                                    item.selectedIcon
                                } else item.unselectedIcon, contentDescription = null
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.White,
                            unselectedIconColor = Color.Black,
                            indicatorColor = Color.Black
                        ),
                    )
                }
            }
        }
    ) {
        // Show content based on selected item
        when (selectedItemIndex) {
            0 -> HomeListScreen(navController) // Replace with your screen composable
            1 -> BookmarkScreen() // Replace with your screen composable
            2 -> TvScreen() // Replace with your screen composable
            3 -> UserScreen() // Replace with your screen composable
        }
    }
}
