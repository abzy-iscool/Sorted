package com.example.sorted.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.InternalTextApi
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sorted.R
import com.example.sorted.navigation.BottomBarScreens
import com.example.sorted.navigation.BottomNavGraph


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@InternalTextApi
@ExperimentalUnitApi
@Composable
fun MainScreen() {
  val navController = rememberNavController()
    
  Scaffold(
      bottomBar = { BottomBar(navController = navController) },
      floatingActionButtonPosition = FabPosition.End,
      floatingActionButton = {
          FloatingActionButton(
              modifier = Modifier
                  .size(80.dp),
              onClick = { navController.navigate("Searchscreen") },
              shape = MaterialTheme.shapes.large,
              containerColor = MaterialTheme.colorScheme.primary,

              ) {
              Icon(
                  modifier = Modifier
                      .size(50.dp),
                  painter = painterResource(id = R.drawable.baseline_search ),
                  contentDescription = "Search Floating Action Button",
                  tint = MaterialTheme.colorScheme.onPrimaryContainer
              )
          }
      },
  ) {
      BottomNavGraph(navController = navController)
  }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreens.Home,
        BottomBarScreens.Dashboard,
        BottomBarScreens.Settings,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar(
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp,30.dp,0.dp,0.dp)),
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreens,
    currentDestination: NavDestination?,
    navController: NavHostController
) {

    NavigationBarItem(
        label = {
            Text(text = screen.title)
        },

        icon = { Icon( imageVector = screen.icon, contentDescription = "icon") },

        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,

        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true

            }
        },

        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = MaterialTheme.colorScheme.onSecondaryContainer,
            selectedTextColor = MaterialTheme.colorScheme.onSurface,
            indicatorColor = MaterialTheme.colorScheme.secondaryContainer,
            unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
            unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant

        )
    )
}




