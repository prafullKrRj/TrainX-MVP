package com.prafullkumar.trainx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.prafullkumar.trainx.ui.theme.TrainXTheme
import com.prafullkumar.workout.WorkoutRoutes
import com.prafullkumar.workout.ui.WorkoutScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainXTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppRoutes.Workout) {
        workoutRoutes(navController)
        composable<AppRoutes.Home> {
            Box(modifier = Modifier.fillMaxSize()) {
                MainScreen(AppRoutes.Home, navController)
            }
        }
        composable<AppRoutes.Food> {
            Box(modifier = Modifier.fillMaxSize()) {
                MainScreen(AppRoutes.Food, navController)
            }
        }
        composable<AppRoutes.Profile> {
            Box(modifier = Modifier.fillMaxSize()) {
                MainScreen(AppRoutes.Profile, navController)
            }
        }
        composable<AppRoutes.Settings> {
            Box(modifier = Modifier.fillMaxSize()) {
                MainScreen(AppRoutes.Settings, navController)
            }
        }
    }
}

fun NavGraphBuilder.workoutRoutes(navController: NavController) {
    navigation<AppRoutes.Workout>(startDestination = WorkoutRoutes.Main) {
        composable<WorkoutRoutes.Main> {
            Box(modifier = Modifier.fillMaxSize()) {
                MainScreen(AppRoutes.Workout, navController)
            }
        }
    }
}

@Composable
fun MainScreen(destination: Any, navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = {
        NavigationBar(Modifier.fillMaxWidth()) {
            NavigationBarItem(
                selected = destination == AppRoutes.Home,
                onClick = { navController.navigate(AppRoutes.Home) },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Home, contentDescription = "Home"
                    )
                },
            )
            NavigationBarItem(
                selected = destination == AppRoutes.Food,
                onClick = { navController.navigate(AppRoutes.Food) },
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.outline_food_bank_24),
                        contentDescription = "Food"
                    )
                },
            )
            NavigationBarItem(
                selected = destination == AppRoutes.Workout,
                onClick = { navController.navigate(AppRoutes.Workout) },
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_fitness_center_24),
                        contentDescription = "Workout"
                    )
                },
            )
            NavigationBarItem(
                selected = destination == AppRoutes.Profile,
                onClick = { navController.navigate(AppRoutes.Profile) },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Person, contentDescription = "Profile"
                    )
                },
            )
            NavigationBarItem(
                selected = destination == AppRoutes.Settings,
                onClick = { navController.navigate(AppRoutes.Settings) },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Settings, contentDescription = "Settings"
                    )
                },
            )
        }
    }) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (destination) {
                AppRoutes.Home -> {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Text(text = "Home")
                    }
                }

                AppRoutes.Food -> {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Text(text = "Food")
                    }
                }

                AppRoutes.Workout -> {
                    WorkoutScreen(navController)
                }

                AppRoutes.Profile -> {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Text(text = "Profile")
                    }
                }

                AppRoutes.Settings -> {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Text(text = "Settings")
                    }
                }
            }
        }
    }
}