package com.prafullkumar.workout.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.prafullkumar.workout.data.db.dao.EquipmentDao
import com.prafullkumar.workout.data.db.dao.ExerciseDao


@Database(entities = [ExerciseEntity::class, EquipmentEntity::class], version = 1, exportSchema = false)
@TypeConverters(StringListConverter::class)
abstract class TrainXDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun equipmentDao(): EquipmentDao
}