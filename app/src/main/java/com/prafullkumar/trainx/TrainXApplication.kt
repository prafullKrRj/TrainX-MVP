package com.prafullkumar.trainx

import android.app.Application
import com.prafullkumar.foodlog.foodLogModule
import com.prafullkumar.workout.data.PopulatingRepository
import com.prafullkumar.workout.workoutModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.get
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DatabasePopulator(
    private val repository: PopulatingRepository
) {
    suspend fun populateIfEmpty() {
        repository.populateDatabase()
    }
}

// 5. Add populator to the module
val populatorModule = module {
    single { DatabasePopulator(get()) }
}

class TrainXApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TrainXApplication)
            modules(workoutModule, populatorModule, foodLogModule)
        }
        CoroutineScope(Dispatchers.IO).launch {
            val populator = get().get<DatabasePopulator>()
            populator.populateIfEmpty()
        }
    }
}