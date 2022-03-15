package com.example.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import com.example.dialog.databinding.ActivityMainBinding
import com.example.dialog.databinding.CustomDialogBinding
import kotlinx.android.synthetic.main.custom_dialog.*

class CustomDialog (context: Context,
                    myCustomDialogInterface: CustomDialogInterface)
                    : Dialog(context) {
    private  var myCustomDialogInterface: CustomDialogInterface? = null

    //인터페이스 연결
    init {

        this.myCustomDialogInterface = myCustomDialogInterface
    }

    //뷰 바인딩
    val MainBinding = ActivityMainBinding.inflate(layoutInflater)
    val CustomBinding = CustomDialogBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)
        val binding = CustomDialogBinding.inflate(layoutInflater)
        //배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        like_btn

        //좋아요 버튼 클릭
        CustomBinding.likeBtn.setOnClickListener(){
            this.myCustomDialogInterface?.onLikeBtnClicked()
        }

        //구독 버튼 클릭
        CustomBinding.subBtn.setOnClickListener(){
            this.myCustomDialogInterface?.onSubscribeBtnClicked()
        }
    }

    override fun onCLick(view: View){
        when(view){
            like_
        }
    }
}