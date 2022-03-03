package com.example.kotlinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.isInvisible
import com.example.kotlinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"MainActivity - onCreate(),called")
        setContentView(R.layout.activity_main)

        //뷰 바인딩

        //자동으로 만들어지는 클래스의 이름은 레이아웃 xml 파일 명을 따름름
       val binding = ActivityMainBinding.inflate(layoutInflater) //binding 객체 호출
        setContentView(binding.root)
    }

    override fun onStart() { // onStart 액티비티가 시작 될 때
        super.onStart()
        Log.d(TAG,"MainActivity - onStart(),called")
    }

    override fun onResume() {// onResume 액티비티가 다시 움직일 때
        super.onResume()
        Log.d(TAG,"MainActivity - onResume(),called")
    }

    override fun onPause() {// onResume 액티비티가 포커스를 빼앗겨 정지한 상태
        super.onPause()
        Log.d(TAG,"MainActivity - onPause(),called")
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.name.visibility = View.VISIBLE
    }

    override fun onStop() {// onStop 화면에서 액티비티가 내려간 상태
        super.onStop()
        Log.d(TAG,"MainActivity - onStop(),called")
    }

    override fun onDestroy() {// onDestroy 액티비티가 파괴된 상태
        super.onDestroy()
        Log.d(TAG,"MainActivity - onDestroy(),called")
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action){
            MotionEvent.ACTION_MOVE -> { //스와이프

            }
            MotionEvent.ACTION_UP ->{// 손 뗌

            }
            MotionEvent.ACTION_DOWN -> { //터치 직후

            }
        }
        return super.onTouchEvent(event)
    }
}