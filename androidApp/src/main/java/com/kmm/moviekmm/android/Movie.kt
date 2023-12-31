package com.kmm.moviekmm.android

import android.app.Application
import com.kmm.moviekmm.android.di.appModule
import com.kmm.moviekmm.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}