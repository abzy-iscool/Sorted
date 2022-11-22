package com.example.sorted.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.text.InternalTextApi
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sorted.presentation.screens.dashboard_screen.DashboardScreen
import com.example.sorted.presentation.screens.detail_screens.House_Card_Detail_screen
import com.example.sorted.presentation.screens.detail_screens.Upload_Home_Screen
import com.example.sorted.presentation.screens.detail_screens.Your_Home_Screen
import com.example.sorted.presentation.screens.home_screen.HomeScreen
import com.example.sorted.presentation.screens.search_screen.Seacrchscreen
import com.example.sorted.presentation.screens.settings_screen.SettingsScreen


@InternalTextApi
@ExperimentalUnitApi
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreens.Home.route
    ) {
        composable(route = BottomBarScreens.Home.route) {
            HomeScreen()
        }

        composable(route = BottomBarScreens.Dashboard.route) {
            DashboardScreen()
        }

        composable(route = BottomBarScreens.Settings.route) {
            SettingsScreen()
        }

        composable("Searchscreen") {
            Seacrchscreen()
        }

        composable("Your_Home_screen") {
            Your_Home_Screen()
        }

        composable("Upload_Home_Screen") {
            Upload_Home_Screen()
        }

        composable("House_Card_Detail_screen") {
            House_Card_Detail_screen()
        }
    }
}









