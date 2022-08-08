package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner : Spinner = findViewById(R.id.my_spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.my_array,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
        ).also { adapter ->
            spinner.onItemSelectedListener
            spinner.adapter = adapter
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {

                }

                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, pos: Int, p3: Long) {
                    if(pos>0) Toast.makeText(this@MainActivity,"${pos}이 선택되었습니다.",
                        Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
}