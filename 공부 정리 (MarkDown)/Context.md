# Context

---

> **Context는 Android 시스템에서 구현체를 제공하는 추상 클래스로, 애플리케이션 별 리소스 및 클래스 접근에 사용되며, 액티비티 실행, 브로드캐스트, 인탠트 수신 등과 같은 애플리케이션 수준 작업에 사용됩니다.**
> 

### Context의 특징

- 애플리케이션의 현재 상태를 나타낸다.
- 액티비티와 어플리케이션의 정보를 얻기 위해 사용할 수 있다.
- 리소스, 데이터베이스, shared preference 등에 접근하기 위해 사용할 수 있다.
- 액티비티와 애플리케이션 클래스는 Context 클래스를 확장한 클래스이다.

### Context의 종류

- **Application Context**
- **Activity Context**

## Application Context

---

> **애플리케이션 컨택스트는 싱글턴 인스턴스이며, 액티비티에서 `*getApplicationContext()*`를 통해 접근할 수 있습니다.**
> 

### 특징

 이 Context는 애플리케이션 Lifecycle에 묶여있고, 현재 Context가 종료된 이후에도 Context가 필요한 작업이나 액티비티 스코프를 벗어난 Context가 필요한 작업에 적합합니다.

*getApplicationContext()*는 딱 위와 같은 경우에만 사용해야 한다.

## Activity Context

---

> **Activity Context는 activity 내에서 유효한 Context입니다. 이 Context는 Activity Lifecycle과 연결되어 있습니다. Activity와 함께 소멸해야 하는 경우에 사용합니다.**
> 

## 때와 장소에 맞는 Context 사용

Activity 밖에서 동작해야 한다면, Application Context를 사용하고, 

Activity 안에서 동작하는 대부분의 일들을 Activity Context를 사용한다.

<aside>
⭐ Content Provider에서는 getContext()를 쓸 때 Application Context를 가져온다

</aside>

### Context를 제대로 사용하면 좋은 점

정상적인 앱 동작 시에 필요한 앱의 현재 상태를 제공해주기 때문에 반드시 **Application Context와 Activity Contex**t를 잘 구분하여 **메모리 누수나 비정상 종료되는 불상사없이 사용하도록 하자.**