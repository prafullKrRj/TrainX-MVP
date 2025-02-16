package com.prafullkumar.foodlog.data

import com.prafullkumar.foodlog.data.local.FoodLogDao
import com.prafullkumar.foodlog.data.local.FoodLogEntity
import com.prafullkumar.foodlog.domain.FoodLogRepository
import kotlinx.coroutines.flow.Flow
import java.util.Calendar

class FoodLogRepositoryImpl(
    private val foodLogDao: FoodLogDao
) : FoodLogRepository {
    override suspend fun insertFoodLog(food: FoodLogEntity): Long {
        return foodLogDao.insertFoodLog(food)
    }

    override fun getAllFoods(): Flow<List<FoodLogEntity>> = foodLogDao.getAllFoodLogs()
    override fun getTodayFoods(): Flow<List<FoodLogEntity>> {
        TODO("Not yet implemented")
    }

    override fun getTodayCalories(): Flow<Int> {
        return foodLogDao.getTodayEatenCalories(start = System.currentTimeMillis().startOfDay(), end = System.currentTimeMillis().endOfDay())
    }

    override fun deleteFoodLog(food: FoodLogEntity) {
        TODO("Not yet implemented")
    }
}
fun Long.startOfDay(): Long {
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = this
    calendar.set(Calendar.HOUR_OF_DAY, 0)
    calendar.set(Calendar.MINUTE, 0)
    calendar.set(Calendar.SECOND, 0)
    calendar.set(Calendar.MILLISECOND, 0)
    return calendar.timeInMillis
}

fun Long.endOfDay(): Long {
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = this
    calendar.set(Calendar.HOUR_OF_DAY, 23)
    calendar.set(Calendar.MINUTE, 59)
    calendar.set(Calendar.SECOND, 59)
    calendar.set(Calendar.MILLISECOND, 999)
    return calendar.timeInMillis
}