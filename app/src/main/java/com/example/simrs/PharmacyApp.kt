package com.example.simrs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.simrs.ui.navigation.NavigationItem
import com.example.simrs.ui.navigation.Screen
import com.example.simrs.ui.screen.*
import com.example.simrs.ui.screen.industry.Form
import com.example.simrs.ui.screen.industry.IndustryForm
import com.example.simrs.ui.screen.industry.ManageIndustryScreen

@Composable
fun PharmacyApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute == Screen.Home.route || currentRoute == Screen.Profile.route) {
                BottomBar(navController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Login.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Login.route) {
                LoginScreen(navigateToHome = {
                    navController.navigate(
                        Screen.Home.route
                    )
                })
            }

            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToMenu = {
                        navController.navigate(
                            Screen.Menu.route
                        )
                    },
                    navigateToFeature = { feature ->
                        navController.navigate(Screen.Feature.createRoute(feature))
                    }
                )
            }

            composable(Screen.Profile.route) {
                ProfileScreen()
            }

            // route: /home/{feature}
            composable(
                route = Screen.Feature.route,
                arguments = listOf(
                    navArgument("feature"){type = NavType.StringType}
                )
            ) {
                val feature = it.arguments?.getString("feature") ?: ""
                FeatureScreen(
                    featureName = feature,
                    navigateToFormScreen = {
                        navController.navigate(Screen.Form.createRoute(feature))
                    },
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }

            // route: /home/{feature}/form
            composable(
                route = Screen.Form.route,
                arguments = listOf(
                    navArgument("feature"){type = NavType.StringType}
                )
            ) {
                val feature = it.arguments?.getString("feature") ?: ""
                when (feature){
                    Feature.INDUSTRI_FARMASI -> {
                        Form(
                            feature,
                            navigateBack = {
                                navController.navigateUp()
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route


    val navigationItems = listOf(
        NavigationItem(
            title = stringResource(R.string.home),
            icon = painterResource(id = R.drawable.home),
            screen = Screen.Home
        ),
        NavigationItem(
            title = stringResource(R.string.profile),
            icon = painterResource(id = R.drawable.profile),
            screen = Screen.Profile
        ),
    )

    BottomNavigation(
        modifier = modifier
    ) {
        BottomNavigation {
            navigationItems.map { item ->
                BottomNavigationItem(
                    selected = currentRoute == item.screen.route,
                    onClick = {
                        navController.navigate(item.screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = item.icon,
                            contentDescription = item.title,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    label = {
                        Text(text = item.title, maxLines = 1)
                    },
                    selectedContentColor = MaterialTheme.colors.secondary,
                    unselectedContentColor = Color.LightGray,
                    modifier = Modifier
                        .background(color = MaterialTheme.colors.surface)
                )
            }
        }
    }
}
