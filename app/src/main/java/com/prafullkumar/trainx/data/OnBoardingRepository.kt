package com.prafullkumar.trainx.data

import com.prafullkumar.trainx.data.db.dao.EquipmentDao
import com.prafullkumar.trainx.data.db.dao.ExerciseDao
import com.prafullkumar.trainx.data.exercise.exercises
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class OnBoardingRepository : KoinComponent {
    private val exerciseDao: ExerciseDao by inject()
    private val equipmentDao: EquipmentDao by inject()
    suspend fun populateDatabase() {
        equipmentDao.insertAll(gymEquipment.map {
            it.toEquipmentEntity()
        })
        exerciseDao.insertExercises(exercises.map {
            it.toExerciseEntity()
        })
    }
}