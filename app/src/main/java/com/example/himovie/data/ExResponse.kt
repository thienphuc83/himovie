package com.example.himovie.data

import com.google.gson.annotations.SerializedName

data class ExResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("original_title") val original_title: String,
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("overview") val overview: String
)