package com.prafullkumar.workout.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text

@Composable
internal fun WorkoutHistoryScreen(
    viewModel: WorkoutViewModel
) {
    Box {
        Text(text = "Workout History")
    }
}