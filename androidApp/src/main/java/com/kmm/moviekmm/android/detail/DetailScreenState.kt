package com.kmm.moviekmm.android.detail

import com.kmm.moviekmm.domain.model.Movie

data class DetailScreenState(
    var loading : Boolean = false,
    var movie : Movie? = null,
    var errorMessage : String? = null
)