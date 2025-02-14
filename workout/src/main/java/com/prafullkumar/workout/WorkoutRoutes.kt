package com.prafullkumar.workout

import kotlinx.serialization.Serializable

sealed interface WorkoutRoutes {

    @Serializable
    data object Main : WorkoutRoutes

    @Serializable
    data object WorkoutPlanDetails : WorkoutRoutes

    @Serializable
    data object CreateWorkoutPlan : WorkoutRoutes

    @Serializable
    data object WorkingOutPlan : WorkoutRoutes
}