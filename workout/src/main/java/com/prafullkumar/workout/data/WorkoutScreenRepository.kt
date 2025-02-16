package com.prafullkumar.workout.data

import com.prafullkumar.workout.data.db.EquipmentEntity
import com.prafullkumar.workout.data.db.dao.EquipmentDao
import com.prafullkumar.workout.data.db.dao.ExerciseDao
import kotlinx.coroutines.flow.Flow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WorkoutScreenRepository : KoinComponent {
    private val equipmentDao: EquipmentDao by inject()

    fun getExerciseEquipment(equipmentId: Int): Flow<EquipmentEntity> {
        return equipmentDao.getEquipmentById(equipmentId)
    }

    private val exerciseDao: ExerciseDao by inject()

    val exercises = exerciseDao.getAllExercises()
    val equipments = equipmentDao.getAllEquipmentFlow()
}