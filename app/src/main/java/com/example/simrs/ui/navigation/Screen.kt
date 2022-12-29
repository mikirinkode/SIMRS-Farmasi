package com.example.simrs.ui.navigation

sealed class Screen(val route: String){
    object Login: Screen("login")
    object Home: Screen("home")
    object Profile: Screen("profile")
    object Feature: Screen("home/{feature}") {
        fun createRoute(feature: String) = "home/$feature"
    }


    object Form: Screen("home/{feature}/form") {
        fun createRoute(feature: String) = "home/$feature/form"
    }

    object Menu: Screen("home/menu")
    object ManageIndustry: Screen("home/menu/industry")
}