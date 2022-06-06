package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.databinding.ItemMainBinding

class MyAdapter(val init: ArrayList<Pair<String,String>> = ArrayList()) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var data = init//adapter가 받아온 arrayList

    //adapter가 하는 일 : 기본적인 recyclerView의 틀을 만든다.
    //viewHolder가 하는 일 : 그렇게 만들어진 틀에 가져온 값들을 올바른 위치에 bind(설정)해준다.
    inner class MyViewHolder(val binding:ItemMainBinding): RecyclerView.ViewHolder(binding.root) {
        fun bindItem(item: Pair<String,String>){//bind라고 하지만 data binding을 통해 data를 설정해주는 함수

            //text 설정
            binding.itemData.text = item.second

            //Glide Library : 인터넷 상에서 이미지를 쉽고 편하게 가져올 수 있는 라이브러리, 나중에 따로 만들어서 공부 예정
            Glide.with(binding.root.context)//item_main xml과 바인딩
                .load(item.first)//img의 url 주소
                .into(binding.profileImg)//이미지를 넣을 객체(profilImg binding 객체)
        }
    }

    //단순히 들어오는 데이터의 개수를 세서 item 개수를 정한다
    override fun getItemCount(): Int = data.size

    //viewHolder가 생성될 때 실행되는 함수, 사실 상 adapter가 호출되면 실행된다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    //다음과 같이 호출되면 MyViewHolder에 값들을 리턴해준다.


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MyViewHolder).apply{
            // 뷰홀더에서 구현한 bindItem메서드를 호출해 뷰홀더에 아이템을 바인딩
            bindItem(data.get(position))
            //adapter에 넣어준 ArrayList 값들을 MyViewHolder에 값으로 넣어준다.
         }
    }
}