package com.kmm.moviekmm.data.repository

import com.kmm.moviekmm.data.remote.RemoteDataSource
import com.kmm.moviekmm.data.util.toMovie
import com.kmm.moviekmm.domain.model.Movie
import com.kmm.moviekmm.domain.repository.MovieRepository

internal class MovieRepositoryImpl(private val remoteDataSource: RemoteDataSource) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId = movieId).toMovie()
    }
}