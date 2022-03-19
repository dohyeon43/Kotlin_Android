package com.example.spinner

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate: Start", )
        val binding = ActivityMainBinding.inflate(layoutInflater)
        var adapter : ArrayAdapter<CharSequence>? = ArrayAdapter.createFromResource(this, R.array.my_array, android.R.layout.simple_spinner_dropdown_item)
        var spinner : Spinner = binding.mySpinner


        spinner.setAdapter(adapter)
        Log.e(TAG, "onCreate: 어댑터 장착", )

        spinner
    }
}