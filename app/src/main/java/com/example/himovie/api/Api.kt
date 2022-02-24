package com.example.himovie.api

interface Api {

    //https://api.themoviedb.org/3

    fun url(): String

    object Config : Api {
        override fun url(): String {
            return "https://api.themoviedb.org/3"
        }
    }

}