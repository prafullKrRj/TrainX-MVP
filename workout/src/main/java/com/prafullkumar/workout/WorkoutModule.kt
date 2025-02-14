package com.prafullkumar.workout

import androidx.room.Room
import com.prafullkumar.workout.data.PopulatingRepository
import com.prafullkumar.workout.data.WorkoutScreenRepository
import com.prafullkumar.workout.data.db.TrainXDatabase
import com.prafullkumar.workout.ui.WorkoutViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val workoutModule = module {
    single {
        Room.databaseBuilder(androidContext(), TrainXDatabase::class.java, "exercise-database")
            .build()
    }
    single {
        get<TrainXDatabase>().equipmentDao()
    }
    single {
        get<TrainXDatabase>().exerciseDao()
    }
    single { PopulatingRepository() }
    single {
        WorkoutScreenRepository()
    }
    viewModel { WorkoutViewModel(get()) }
}