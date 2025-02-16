package com.prafullkumar.trainx

import kotlinx.serialization.Serializable

sealed interface AppRoutes {

    @Serializable
    data object Profile : AppRoutes

    @Serializable
    data object Workout : AppRoutes

    @Serializable
    data object Food : AppRoutes

    @Serializable
    data object Home : AppRoutes

    @Serializable
    data object Settings : AppRoutes
}

