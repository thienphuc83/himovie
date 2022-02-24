package com.example.himovie.api

interface Config {
    //https://api.themoviedb.org/3

    fun url(): String
}
object DevConfig : Config {
    override fun url(): String {
        return "https://api.themoviedb.org/3"
    }
}