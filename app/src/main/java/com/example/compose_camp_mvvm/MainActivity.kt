package com.example.compose_camp_mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.compose_camp_mvvm.repository.PersonRepository
import com.example.compose_camp_mvvm.ui.GithubSearchViewModel
import com.example.compose_camp_mvvm.ui.screen.GithubSearchScreen
import com.example.compose_camp_mvvm.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint
import okio.blackholeSink

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    private val viewModel by viewModels<GithubSearchViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.background(color = Color.Black))

                {


                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {

                        navController = rememberNavController()
                        SetupNavGraph(navController = navController)



                         GithubSearchScreen(viewModel)



                        }
                    }
                }
            }
        }
    }


