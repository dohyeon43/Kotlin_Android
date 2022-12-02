package com.example.study1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import com.example.study1.databinding.ActivityDataBinding

//import com.example.study1.databinding.ActivityViewBindingBinding


class MainActivity : AppCompatActivity() {
    val mutableLiveData = MutableLiveData<Int>(0)
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        //View binding
        /*val binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        */

        //DataBinding
        setContentView(R.layout.activity_data)
        val binding : ActivityDataBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_data)
        binding.btn.setOnClickListener(View.OnClickListener {
            mutableLiveData.value = mutableLiveData.value?.plus(1)
            Log.e("TEST","잘 실행됨.")
        })




    }
}