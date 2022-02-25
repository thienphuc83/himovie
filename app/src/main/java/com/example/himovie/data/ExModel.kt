package com.example.himovie.data

import java.io.Serializable

data class ExModel(
    val id: Int,
    val original_title: String,
    val poster_path: String,
    val overview: String
) : Serializable
