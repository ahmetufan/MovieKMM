package com.kmm.moviekmm.domain.repository

import com.kmm.moviekmm.domain.model.Movie

internal interface MovieRepository {

    suspend fun getMovies(page : Int) : List<Movie>
    suspend fun getMovie(movieId : Int) : Movie
}