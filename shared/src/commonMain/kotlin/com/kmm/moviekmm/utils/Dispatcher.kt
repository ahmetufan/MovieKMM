package com.kmm.moviekmm.utils

import kotlinx.coroutines.CoroutineDispatcher

internal interface Dispatcher {
    val io : CoroutineDispatcher
}

internal expect fun provideDispatcher() : Dispatcher