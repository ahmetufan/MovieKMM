package com.kmm.moviekmm.di

import com.kmm.moviekmm.data.remote.MovieService
import com.kmm.moviekmm.data.remote.RemoteDataSource
import com.kmm.moviekmm.data.repository.MovieRepositoryImpl
import com.kmm.moviekmm.domain.repository.MovieRepository
import com.kmm.moviekmm.domain.usecase.GetMovieUseCase
import com.kmm.moviekmm.domain.usecase.GetMoviesUseCase
import com.kmm.moviekmm.utils.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    factory { GetMovieUseCase() }
    factory { GetMoviesUseCase() }
    single <MovieRepository> {MovieRepositoryImpl(get())}
}

private val sharedModules = listOf(dataModule, utilModule, domainModule)

fun getSharedModules() = sharedModules