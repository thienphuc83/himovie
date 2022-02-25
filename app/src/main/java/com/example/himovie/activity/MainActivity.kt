package com.example.himovie.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.himovie.R
import com.example.himovie.api.Config
import com.example.himovie.data.ExResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<ExResponse> {

    lateinit var exResponse: ExResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCallApi.setOnClickListener {
            onCallApi()
        }

    }

    private fun onCallApi() {
        Config.apiService.getExample("9fd4581a0377d675761b350cc9a405c1").enqueue(this)
    }

    override fun onResponse(call: Call<ExResponse>, response: Response<ExResponse>) {
        if (response?.body() == null) {
            return
        }
        exResponse = response.body()!!

    }

    override fun onFailure(call: Call<ExResponse>, t: Throwable) {
        Toast.makeText(applicationContext, "error", Toast.LENGTH_SHORT).show()
    }
}