package com.example.simrs.ui.navigation

sealed class Screen(val route: String){
    object Login: Screen("login")
    object Home: Screen("home")
    object Profile: Screen("profile")
}