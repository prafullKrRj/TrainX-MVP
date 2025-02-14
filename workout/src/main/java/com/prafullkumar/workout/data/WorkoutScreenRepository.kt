package com.prafullkumar.workout.data

import com.prafullkumar.workout.data.db.dao.ExerciseDao
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WorkoutScreenRepository : KoinComponent {
    private val exerciseDao: ExerciseDao by inject()

    val exercises = exerciseDao.getAllExercises()

}