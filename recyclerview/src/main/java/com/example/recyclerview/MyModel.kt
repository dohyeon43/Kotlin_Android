package com.example.recyclerview

import android.util.Log


    class MyModel(var name: String? = null , var profilImage: String? = null)//널 허용 & 널 값 적용
    {
        val TAG: String = "로그"
        //기본 생성자
        init {
            Log.d(TAG,"MyModel - init(),called")
        }
    }