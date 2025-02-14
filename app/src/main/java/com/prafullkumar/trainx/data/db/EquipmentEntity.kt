package com.prafullkumar.trainx.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "equipment")
data class EquipmentEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val imageUrl: String
)