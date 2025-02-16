package com.prafullkumar.foodlog.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_log")
data class FoodLogEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val foodName: String,
    val calories: Int,
    val time: Long = System.currentTimeMillis(),
    val mealType: String,
    val foodType: String,
    val protein: Int = 0,
    val carbs: Int = 0,
    val fats: Int = 0
)