package com.prafullkumar.foodlog

import kotlinx.serialization.Serializable


sealed interface FoodRoutes {

    @Serializable
    data object Main : FoodRoutes

    @Serializable
    data object AddFood : FoodRoutes

    @Serializable
    data object FoodDetails : FoodRoutes

    @Serializable
    data object FoodHistory : FoodRoutes
}