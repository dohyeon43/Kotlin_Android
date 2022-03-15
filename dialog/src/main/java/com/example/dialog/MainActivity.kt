package com.example.dialog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CustomDialogInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //다이얼로그 열기 버튼
        binding.dialogButton.setOnClickListener(){
            val CustomDialog = CustomDialog(this,this)
            CustomDialog.show()
        }
    }

    override fun onLikeBtnClicked() {
        TODO("Not yet implemented")
        Toast.makeText(this,"좋아요 버튼 클릭!",Toast.LENGTH_SHORT).show()
    }

    override fun onSubscribeBtnClicked() {
        TODO("Not yet implemented")
        Toast.makeText(this,"구독 버튼 클릭!",Toast.LENGTH_SHORT).show()
    }
}