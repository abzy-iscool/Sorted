package com.example.sorted.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreens(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreens(
        route = "home",
        title = "Home",
        icon = Icons.Outlined.Home
    )

    object Dashboard : BottomBarScreens(
        route = "Dashboard",
        title = "Dash",
        icon = Icons.Outlined.Person
    )

    object Settings : BottomBarScreens(
        route = "settings",
        title = "Settings",
        icon = Icons.Outlined.Settings
    )

}
