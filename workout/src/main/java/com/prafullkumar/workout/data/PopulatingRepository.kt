package com.prafullkumar.workout.data

import com.prafullkumar.workout.data.db.dao.EquipmentDao
import com.prafullkumar.workout.data.db.dao.ExerciseDao
import com.prafullkumar.workout.data.exercise.exercises
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class PopulatingRepository : KoinComponent {
    private val exerciseDao: ExerciseDao by inject()
    private val equipmentDao: EquipmentDao by inject()

    suspend fun populateDatabase() {

        if (equipmentDao.getAllEquipment().isNotEmpty()) {
            return
        }

        equipmentDao.insertAll(gymEquipment.map {
            it.toEquipmentEntity()
        })
        exerciseDao.insertExercises(exercises.map {
            it.toExerciseEntity()
        })
    }
}