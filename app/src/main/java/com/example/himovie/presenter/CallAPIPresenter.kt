package com.example.himovie.presenter

import com.example.himovie.api.Config
import com.example.himovie.model.Example
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CallAPIPresenter : Callback<Example> {

    // khai báo interface
    private var callAPIInterface: CallAPIInterface

    constructor(callAPIInterface: CallAPIInterface) {
        this.callAPIInterface = callAPIInterface
    }

    // gọi api
    fun onCallAPI(key_api: String) {
        Config.apiService.getExample(key_api).enqueue(this)
    }

    override fun onResponse(call: Call<Example>, response: Response<Example>) {
        if (response.body() == null) {
            callAPIInterface.onCallAPIDataNull()
            return
        }
        callAPIInterface.onCallAPISuccess(response.body()!!)
    }

    override fun onFailure(call: Call<Example>, t: Throwable) {
        callAPIInterface.onCallAPIFail("error")
    }
}