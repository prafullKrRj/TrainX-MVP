package com.prafullkumar.trainx

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.prafullkumar.trainx.data.OnBoardingRepository
import com.prafullkumar.trainx.data.db.TrainXDatabase
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module


val appModule = module {
    single {
        Room.databaseBuilder(androidContext(), TrainXDatabase::class.java, "database-name")
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    runBlocking {
                        get<OnBoardingRepository>().populateDatabase()
                    }
                }
            })
            .build()
    }
    single { OnBoardingRepository() }
    single {
        get<TrainXDatabase>().equipmentDao()
    }
    single {
        get<TrainXDatabase>().exerciseDao()
    }

}

class TrainXApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {

        }
    }
}