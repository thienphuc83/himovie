package com.example.himovie.model

import com.google.gson.annotations.SerializedName

data class Example(
    @SerializedName("id") val id: Int,
    @SerializedName("original_title") val original_title: String,
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("overview") val overview: String
)