package com.example.jetreaderapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetreaderapp.screens.ReaderSplashScreen
import com.example.jetreaderapp.screens.details.BookDetailsScreen
import com.example.jetreaderapp.screens.home.HomeScreen
import com.example.jetreaderapp.screens.login.ReaderLoginScreen
import com.example.jetreaderapp.screens.search.SearchScreen
import com.example.jetreaderapp.screens.stats.ReaderStatsScreen
import com.example.jetreaderapp.screens.update.BookUpdateScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ReaderScreens.SearchScreen.name) {
        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderHomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(ReaderScreens.DetailScreen.name) {
            BookDetailsScreen(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name) {
            ReaderLoginScreen(navController = navController)
        }

        composable(ReaderScreens.SearchScreen.name) {
            SearchScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderStatsScreen.name) {
            ReaderStatsScreen(navController = navController)
        }

        composable(ReaderScreens.UpdateScreen.name) {
            BookUpdateScreen(navController = navController)
        }
    }
}