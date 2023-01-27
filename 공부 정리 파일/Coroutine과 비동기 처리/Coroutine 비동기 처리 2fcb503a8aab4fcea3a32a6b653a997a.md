# Coroutine 비동기 처리

<aside>
⭐ **Coroutine을 왜 써야 할까?**

**동시성**

작업을 동시에 진행하지 못하면 병목현상이 발견하고 
총 작업의 진행이 지연됨. 사용자는 그 시간동안 불편함을 느낌.

또, 디스크의 처리 용량도 낭비하게 됨.

**병렬성**

SMP (Symmetric Multiproccesor)을 통해
여러 프로세스가 하나의 메모리에서 공존할 수 있게 되었다.

(멀티 코어)

하지만, 프로그래밍 과정에서 가독성의 문제가 생기며 
CallBack과 Rx로는 한계가 생기게 되었다.

Coroutine은 동시성과 병렬성을 순차적으로
Flow는 이를 Stream(하나의 흐름으로 나타냄)

</aside>

<aside>
⭐ **비동기/동기란?**

**Async**

동시 진행

**Sync**

진행

</aside>

## ✅Coroutine 기초 개념 정리

**ScopeBuilder**는 Coroutine을 생성하는 함수들로, `runBlocking`, `launch` 등이 있다.
`runBlocking`은 말 그대로 코드 블럭의 진행이 끝나지 않을때까지 다음코드를 수행하지 않고, 
`launch`는 작업 동안에도 다음 코드를 실행할 수 있다.

```kotlin
fun main() = runBlocking { // Coroutine, 수신 객체
		launch { // Coroutine, 수신 객체
		println("1")
	}
}
```

**Sleep**과 **Delay** 또한 존재한다. 

```kotlin
//다른 쓰레드 작업 X, 메인 쓰레드까지 멈출 수 있다.
Thread.sleep(200)

//해당 코루틴 정지하고 다른 코루틴에 양보함.
delay(200)
//이를 suspension point (중단점)이라고 한다.
```

상위 Coroutine은 하위 Coroutine을 끝까지 책임지기 때문에 하위 Coroutine의 작업이 끝날때까지
상위 Coroutine도 끝나지 않는다. **계층적인 구조**로 이루어져 있다.

`suspend` → 중단 가능한 함수
Coroutine 안에서 함수를 사용하려면 suspend function을 만들어야 한다.

CoroutineBuilder를 suspend 함수 안에서 **호출 불가
Coroutine은 Coroutine Scope안에서만**

 ****`launch` 빌더는 `job` 함수를 사용해 다음 코드가 작업을 기다리도록 만들 수 있다.

```kotlin
fun main() = runBlocking { // Coroutine, 수신 객체
	val job = launch { // Coroutine, 수신 객체
		delay(1000L)
		println("1")
	}
	job.join()//suspension point

	launch { // Coroutine, 수신 객체
		println("2")
	}
}
```

Coroutine은 협력적으로 동작하기에 10만 개를 만들어서 
가벼운 동작을 수행하는 것도 가능한 일이다.

```kotlin
fun main() = runBlocking { // Coroutine, 수신 객체
	repeat(1000000){ // 반복
		launch { // Coroutine, 수신 객체
			delay(1000L)
			println("1")
		}
	}
}
```

**job**에 대해 `cancel` 을 통해 진행중이던 작업을 취소할 수 있다.

```kotlin

```

## Coroutine Flow

---

[Coroutine Flow](https://www.notion.so/Coroutine-Flow-dc3f0c5800de4a98a56c739d151aba7b)