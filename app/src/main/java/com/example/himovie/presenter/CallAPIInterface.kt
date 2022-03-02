package com.example.himovie.presenter

import com.example.himovie.model.Example

interface CallAPIInterface {
    fun onCallAPISuccess(example: Example)
    fun onCallAPIFail(error: String)
    fun onCallAPIDataNull()
}