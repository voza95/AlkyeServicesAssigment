package com.oza.alkyeservicesassigment

sealed class Screen(val route: String) {
    object LoginScreen: Screen("login_screen")
    object HomeScreen: Screen("home_screen")
    object DetailScreen: Screen("detail_screen")


    object HomeListScreen: Screen("home_list_screen")
    object BookmarkScreen: Screen("bookmark_screen")
    object TvScreen: Screen("tv_screen")
    object UserScreen: Screen("tv_screen")
}