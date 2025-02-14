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



sealed interface FoodRoutes {

    @Serializable
    data object AddFood : FoodRoutes

    @Serializable
    data object FoodDetails : FoodRoutes

    @Serializable
    data object FoodHistory : FoodRoutes

}