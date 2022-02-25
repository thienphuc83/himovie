package com.example.himovie.api

import com.example.himovie.data.ExResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // https://api.themoviedb.org/3/movie/550?api_key=9fd4581a0377d675761b350cc9a405c1

    @GET("movie/550")
    fun getExample(@Query("api_key") api_key: String): Call<ExResponse>

}