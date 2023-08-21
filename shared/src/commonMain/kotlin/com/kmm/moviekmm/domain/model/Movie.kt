package com.kmm.moviekmm.domain.model

import kotlinx.serialization.SerialName

class Movie (
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val releaseDate: String
)