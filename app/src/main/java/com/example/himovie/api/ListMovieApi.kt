package com.example.himovie.api

import com.google.gson.annotations.SerializedName

data class ListMovieApi(
    @SerializedName("id") val id: Int,
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<MovieApi>,
    @SerializedName("total_pages") val total_pages: Int,
    @SerializedName("total_results") val total_results: Int,
)

data class MovieApi(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val nameMovie: String,
    @SerializedName("description") val description: String,
)