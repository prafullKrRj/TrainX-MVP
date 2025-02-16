package com.prafullkumar.foodlog.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.prafullkumar.foodlog.domain.FoodLogRepository

class AddFoodViewModel(
    private val savedStateHandle: SavedStateHandle,
    private val foodLogRepository: FoodLogRepository
) : ViewModel() {

}