package com.example.recyclerview.viewholder

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.App
import com.example.recyclerview.MyModel
import com.example.recyclerview.R

//커스텀 뷰홀더
class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val TAG: String = "로그"
    private val usernameTextVIew = itemView
    private val profileImageView = itemView
    //기본 생성자
    init {
        Log.d(TAG,"MyViewHolder - init (),called")
    }

    //데이터와 뷰를 묶는다
    fun bind(myModel: MyModel){
        Log.d(TAG,"MyViewHolder - bind(),called")

        //이미지뷰와 실제 이미지 데이터를 묶는다.
        Glide
            .with(App.instance)
            .load(myModel.profilImage)
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher)
            //.into()

    }
}