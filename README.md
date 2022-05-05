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
#### 노션에 정리하려 했는데... 여기가 편할 것 같습니다.

## 테스트

```kotlin
package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2.databinding.ActivityMainBinding
import com.example.viewpager2.databinding.FragmentViewBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
    }
}

```
## MVVM + CA(클린 아키텍처) 구조 공부
### DATA(Model)
### DOMAIN(Model)
### PRESENTATION(ViewModel, View)
