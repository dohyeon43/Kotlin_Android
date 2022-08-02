package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.MyAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var TAG: String = "로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = arrayListOf<Pair<String,String>>(Pair("https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2014%2F09%2F21%2F14%2F39%2Fsurface-455124__480.jpg&imgrefurl=https%3A%2F%2Fpixabay.com%2Fko%2Fimages%2Fsearch%2F%25EB%25B9%2584%2F&tbnid=YTFoYOX0Qu2vSM&vet=12ahUKEwjdia_H-pn3AhUYSfUHHco6DgQQMygCegUIARDcAQ..i&docid=3t2BMyjwVXQjaM&w=826&h=480&q=%EC%9D%B4%EB%AF%B8%EC%A7%80&ved=2ahUKEwjdia_H-pn3AhUYSfUHHco6DgQQMygCegUIARDcAQ","크흠"),
        Pair("https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2014%2F09%2F21%2F14%2F39%2Fsurface-455124__480.jpg&imgrefurl=https%3A%2F%2Fpixabay.com%2Fko%2Fimages%2Fsearch%2F%25EB%25B9%2584%2F&tbnid=YTFoYOX0Qu2vSM&vet=12ahUKEwjdia_H-pn3AhUYSfUHHco6DgQQMygCegUIARDcAQ..i&docid=3t2BMyjwVXQjaM&w=826&h=480&q=%EC%9D%B4%EB%AF%B8%EC%A7%80&ved=2ahUKEwjdia_H-pn3AhUYSfUHHco6DgQQMygCegUIARDcAQ","크흠"))

        binding.recyclerView.apply {//apply를 사용해 코드를 간편하게 만듬. kotlin에 있는 이런 함수들도 공부해야겠다.
            adapter = MainAdapter(data)
            layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
            //레이아웃 매니저로 리사이클러 뷰가 어떻게 배치될지 정한다.
        }
    }
}