package com.oza.alkyeservicesassigment

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.oza.alkyeservicesassigment.screens.*

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.HomeListScreen.route) {
            HomeListScreen(navController = navController)
        }
        composable(route = Screen.BookmarkScreen.route) {
            BookmarkScreen()
        }
        composable(route = Screen.TvScreen.route) {
            TvScreen()
        }
        composable(route = Screen.UserScreen.route) {
            UserScreen()
        }
        composable(route = Screen.DetailScreen.route + "/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) { entry ->
            DetailScreen(navController = navController, id = entry.arguments?.getInt("id"))
        }
    }
}