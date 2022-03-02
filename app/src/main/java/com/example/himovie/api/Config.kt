package com.example.himovie.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Config {

    var URL_BASE = "https://api.themoviedb.org/3/"
    private var retrofit: Retrofit? = null

    val apiService: ApiService
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!.create(ApiService::class.java)
        }
}