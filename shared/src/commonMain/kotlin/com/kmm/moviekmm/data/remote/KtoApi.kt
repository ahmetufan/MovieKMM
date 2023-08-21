package com.kmm.moviekmm.data.remote

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

// https://api.themoviedb.org/3/movie/603692?api_key=d98c5041b9385334b1843046ff779213
// https://api.themoviedb.org/3/movie/popular?page=1&api_key=d98c5041b9385334b1843046ff779213

private const val BASEU_URL = "https://api.themoviedb.org/3/"
private const val API_KEY = "d98c5041b9385334b1843046ff779213"

internal abstract class KtorApi {
    val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    fun HttpRequestBuilder.pathUrl(path : String) {
        url {
            takeFrom(BASEU_URL)
            path("3", path)
            parameter("api_key", API_KEY)
        }
    }
}