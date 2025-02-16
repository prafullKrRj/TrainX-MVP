package com.prafullkumar.foodlog.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prafullkumar.foodlog.domain.FoodLogRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class FoodLogMainViewModel(
    private val foodLogRepository: FoodLogRepository
) : ViewModel() {

    val currentEatenCalories = foodLogRepository.getTodayCalories()
        .stateIn(viewModelScope, started = SharingStarted.Lazily, 0)

    val foodLog =
        foodLogRepository.getAllFoods()
            .stateIn(viewModelScope, started = SharingStarted.Lazily, emptyList())

    var goalCalories = "1888 kcal"
}