package com.example.himovie.data

import java.io.Serializable

data class Movie(
    val id: Int,
    val nameMovie: String,
    val description: String
) : Serializable
