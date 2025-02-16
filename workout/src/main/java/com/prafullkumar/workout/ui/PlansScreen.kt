package com.prafullkumar.workout.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

@Composable
fun PlansScreen(
    viewModel: WorkoutViewModel,
    navController: NavController
) {
    Box(Modifier.fillMaxSize()) {
        Text(text = "Workout Plans")
    }
}