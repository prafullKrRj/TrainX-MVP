package com.prafullkumar.foodlog

import androidx.room.Room
import com.prafullkumar.foodlog.data.FoodLogRepositoryImpl
import com.prafullkumar.foodlog.data.local.FoodLogDao
import com.prafullkumar.foodlog.data.local.FoodLogDatabase
import com.prafullkumar.foodlog.domain.FoodLogRepository
import com.prafullkumar.foodlog.ui.FoodLogMainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val foodLogModule = module {
    single<FoodLogDatabase> {
        Room.databaseBuilder(androidContext(), FoodLogDatabase::class.java, "food_log_db")
            .build()
    }
    single<FoodLogDao> {
        get<FoodLogDatabase>().foodLogDao()
    }
    single<FoodLogRepository> { FoodLogRepositoryImpl(get()) }
    viewModel { FoodLogMainViewModel(get()) }
}