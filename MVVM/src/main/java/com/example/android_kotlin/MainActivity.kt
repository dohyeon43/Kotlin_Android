package com.example.android_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.android_kotlin.databinding.ActivityMainBinding
import com.example.android_kotlin.viewModel.MainViewModel
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    lateinit var mBinding : ActivityMainBinding
    val model: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        //retrofit 객체 생성
        val retrofit = Retrofit.Builder().baseUrl("").addConverterFactory(GsonConverterFactory.create()).build()
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mBinding.lifecycleOwner = this
        mBinding.viewModel = model
    }
}