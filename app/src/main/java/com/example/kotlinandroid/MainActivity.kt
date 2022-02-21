package com.example.kotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //자동으로 만들어지는 클래스의 이름은 레이아웃 xml 파일 명을 따름름
       val binding = ActivityMainBinding.inflate(layoutInflater) //binding 객체 호출
        setContentView(binding.root)

        binding.activity1.setText("activiry 1")

        }
    }