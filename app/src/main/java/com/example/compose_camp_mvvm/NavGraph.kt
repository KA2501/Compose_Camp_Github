package com.example.compose_camp_mvvm

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.asj.example.ui.components.GithubUserProfile
import com.example.compose_camp_mvvm.model.Person

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Items.route
    ){
        composable(
            route= Screen.Items.route
        ){
            GithubApplication()
        }
        composable(
            route= Screen.Details.route
        ){
            MainActivity()
        }
    }
}