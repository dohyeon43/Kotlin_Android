package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var TAG: String = "로그"
    var modelList = ArrayList<MyModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"MainActivity - onCreate(),called")
        Log.d(TAG,"MainActivity - this.modelList.size : ${this.modelList.size}")
        for (i in 1..10){
            val myModel = MyModel(name = "김도현 $i",profilImage = "")
            this.modelList.add(myModel)
        }
        Log.d(TAG,"MainActivity - this.modelList.size : ${this.modelList.size}")
    }
}