package com.prafullkumar.trainx.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import com.prafullkumar.trainx.data.db.ExerciseEntity

@Dao
interface ExerciseDao {

    @Insert(entity = ExerciseEntity::class)
    suspend fun insertExercises(exercises: List<ExerciseEntity>)

}