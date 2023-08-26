package com.kmm.moviekmm.android.di


import com.kmm.moviekmm.android.detail.DetailViewModel
import com.kmm.moviekmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}