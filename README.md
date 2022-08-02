# Kotlin_Android

라이브러리 기능들과 
안드로이드 디자인 패턴을 
여러 모듈로 나눠 구현하고 공부하는 레포지토리입니다.

### [구현한 기능]
RecyclerView, Spinner 구현해보았습니다.

### [아키텍처]
MVVM 패턴 구현 예정

### [아키텍처 관련 기능]
LiveData, SingleLiveEvent, Event 구현 예정


# 공부 정리

>## Activity와 Fragment (생명주기, 차이점, 사용법)
>![image](https://mblogthumb-phinf.pstatic.net/MjAxOTA5MDZfMTI5/MDAxNTY3Njk5MzA4Nzcw.s0jYFSugA5Kg82sMc8XBFuI5hcmUfIzSvohMILrJ2-Mg.rKHyPbRnf-9mTcwL-kfDutAferD3rk1gg_eAv7qxDsUg.PNG.devks0228/image.png?type=w800)
>![image](https://velog.velcdn.com/images%2Feun3673%2Fpost%2F1cee08b0-cc76-4680-8863-3d44726a69b1%2F22AC6833597EDA1626.png)

>## Context란?

>## MVVM이란 무엇인가?
>### MVVM 아키텍처의 발단
>적은 리소스 안에서 돌아가는 모바일 앱의 특성 상, 앱이 파괴된다.
>그로 인해 
>
>### 장점
>* View와 Model이 서로 전혀 알지 못하기에 독립성을 유지할 수 있다
>* 독립성을 유지하기 때문에 효율적인 유닛테스트가 가능하다
>* View와 ViewModel을 바인딩하기 때문에 코드의 양이 줄어든다
>* View와 ViewModel의 관계는 N:1 관계이다
>* 유닛테스트를 하기가 좋습니다. 그 이유는 ViewModel에는 UIKit 관련 코드가 없고 Controller와의 의존성도 없기 때문이다
>* 유닛테스트(Unit Test)는 하나의 메서드의 특정 루틴을 검사한다.
>
>### 단점
>* 간단한 UI에서 오히려 ViewModel을 설계하는 어려움이 있을 수 있다.
>* 데이터 바인딩이 필수적으로 요구된다.
>* 복잡해질수록 Controller처럼 ViewModel이 빠르게 비대해진다. 표준화된 틀이 존재하지 않아 사람마다 이해가 다르다.
>(표준화 필요)
>* View가 변수와 표현식 모두에 binding 될 수 있으므로 시간이 지남에 따라 관계없는 Presentation Logic이 늘어나고 이를 보완하기 위해 XML에 코드를 추가하게 된다. 
>이때 난해하게 코드가 증가된다면 유지보수 단계에서 어려움을 겪을 수 있다.
>
>### DataBinding이란 무엇인가?
>[데이터 바인딩](URL)
>-------------------------------
>### 참고 이미지
>![image](https://user-images.githubusercontent.com/81676485/168805442-04940e2b-9e32-443e-90f0-a2c88f1493dc.png)
>### [아키텍처 구조 - 안드로이드 공식 사이트](https://developer.android.com/jetpack/guide?hl=ko)
## RecyclerView
```
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
```
Adapter 코드

## MVVM + CA(클린 아키텍처) 구조 공부
### DATA(Model)
서버와 통신하는 계층
ㄴ Remote
ㄴ Cache
ㄴ DataSouce

### DOMAIN(Model)
모델 제공 계층

### PRESENTATION(ViewModel, View)
실제 앱이 구동되는 계층
