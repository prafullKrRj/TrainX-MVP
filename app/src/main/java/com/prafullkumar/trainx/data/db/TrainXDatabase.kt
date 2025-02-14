package com.prafullkumar.trainx.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.prafullkumar.trainx.data.db.dao.EquipmentDao
import com.prafullkumar.trainx.data.db.dao.ExerciseDao


@Database(entities = [ExerciseEntity::class, EquipmentEntity::class], version = 1, exportSchema = false)
@TypeConverters(StringListConverter::class)
abstract class TrainXDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun equipmentDao(): EquipmentDao
}