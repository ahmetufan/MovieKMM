package com.kmm.moviekmm.utils

import com.kmm.moviekmm.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(getSharedModules())
    }
}