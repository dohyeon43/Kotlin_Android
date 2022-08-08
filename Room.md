# Room과 Shared Preferences

(SQLite, Saved Instance State)

## 1. SharedPreferences

---

**SharedPrefrences**는 소량의 데이터를 키/값의 형식으로 저장하고, **SharedPreferences API** 를 통해 값을 읽고 쓰고 관리할 수 있다.

**SharedPreferences**는 앱 내부에 xml의 형태로 데이터를 저장한다.

액티비티에서 자주 사용되는 **Saved Instance State**와 비교한 표이다.

![Untitled](Room%E1%84%80%E1%85%AA%20Shared%20Preferences%2005a5d959cd8b4c55bc7e0eb3e28ae885/Untitled.png)

### 사용법

```kotlin
//SharedPreferences 생성
var pref : SharedPreferences 
//getSharedPrefeences()는 Context가 있는 모든 컴포넌트에서 호출 가능
= getSharedPreferences(name, Activity.MODE_PRIVATE)//Activity.MODE_PRIVATE는 기본값이다.

//SharedPreferences Editor 생성
var editor : SharedPreferences.Editor
= pref.edit()

//값 저장
//putOOO() : 저장하는 데이터의 자료형에 따라 다른 함수를 쓴다.
editor.putInt("key", 1) //putInt()를 통해 키("key")와 값(1)을 올려준다.
editor.commit() //editor.apply()를 써도 무방하다. 
//commit()를 사용해 SharedPreferences에 올린 값을 저장해준다.

//값 가져오기
//getOOO() : 가져오는 데이터의 자료형에 따라 다른 함수를 쓴다.
editor.getInt("key", 0) //getInt()에 키("key")와 키에 해당하는 데이터가 없을 경우, 반환되는 값(0)을 넣어준다.
```

---

## 2. Room

---

**Room**은
