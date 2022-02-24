package com.example.himovie.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    private lateinit var retrofitClient: RetrofitClient
    private lateinit var myApi: Api

    private fun retrofitClient() {
        val retrofit: Retrofit = Retrofit.Builder().baseUrl(myApi.url())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

//        myApi = retrofit.create(Api::class.java)
    }
}