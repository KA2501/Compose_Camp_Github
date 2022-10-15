package com.example.compose_camp_mvvm

sealed class Screen(val route: String){
    object Items: Screen(route = "custom_items")
    object Details: Screen(route = "detail_screen")
}
