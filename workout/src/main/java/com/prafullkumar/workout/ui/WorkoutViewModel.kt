package com.prafullkumar.workout.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prafullkumar.workout.data.WorkoutScreenRepository
import com.prafullkumar.workout.data.db.EquipmentEntity
import com.prafullkumar.workout.data.db.ExerciseEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class WorkoutViewModel(
    private val repository: WorkoutScreenRepository
) : ViewModel() {

    val exercises: StateFlow<List<ExerciseEntity>> = repository.exercises.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList()
    )

    fun getExerciseEquipment(equipmentId: Int): Flow<EquipmentEntity> =
        repository.getExerciseEquipment(equipmentId)
}