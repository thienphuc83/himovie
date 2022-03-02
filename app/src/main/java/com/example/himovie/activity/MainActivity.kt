package com.example.himovie.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.himovie.R
import com.example.himovie.model.Example
import com.example.himovie.presenter.CallAPIInterface
import com.example.himovie.presenter.CallAPIPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CallAPIInterface {

    // khai báo presenter
    private lateinit var callAPIPresenter: CallAPIPresenter

    // truyền param để gọi data từ api
    private val keyAPI: String = "9fd4581a0377d675761b350cc9a405c1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // khoi tao presenter
        callAPIPresenter = CallAPIPresenter(this)

        btnCallApi.setOnClickListener {
            callAPIPresenter.onCallAPI(keyAPI)
        }
    }

    // xử lý data từ presenter qua interface
    override fun onCallAPISuccess(example: Example) {
        tvData.text = example.original_title
    }

    override fun onCallAPIFail(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT)
    }

    override fun onCallAPIDataNull() {
        Toast.makeText(this, "data null", Toast.LENGTH_SHORT)
    }
}