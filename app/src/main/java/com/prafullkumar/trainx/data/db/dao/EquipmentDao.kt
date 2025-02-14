package com.prafullkumar.trainx.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.prafullkumar.trainx.data.db.EquipmentEntity

@Dao
interface EquipmentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(equipment: List<EquipmentEntity>)

    @Query("SELECT * FROM equipment")
    suspend fun getAllEquipment(): List<EquipmentEntity>
}
