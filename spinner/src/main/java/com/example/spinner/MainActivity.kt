package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner : Spinner = findViewById(R.id.my_spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.my_array,
            R.layout.activity_main
        ).also { adapter ->
            spinner.onItemSelectedListener
            spinner.adapter = adapter
        }
    }
}