package com.example.kotlinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //자동으로 만들어지는 클래스의 이름은 레이아웃 xml 파일 명을 따름름
       val binding = ActivityMainBinding.inflate(layoutInflater) //binding 객체 호출
        setContentView(binding.root)

        binding.activity1.setOnClickListener(){
            val intent = Intent(this,Activity1::class.java)
            startActivity(intent)
        }
        binding.activity2.setOnClickListener(){
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }
        binding.activity3.setOnClickListener(){
            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }
        binding.activity4.setOnClickListener(){
            val intent = Intent(this,Activity4::class.java)
            startActivity(intent)
        }
        binding.activity5.setOnClickListener(){
            val intent = Intent(this,Activity5::class.java)
            startActivity(intent)
        }
        binding.activity6.setOnClickListener(){
            val intent = Intent(this,Activity6::class.java)
            startActivity(intent)
        }

    }
}