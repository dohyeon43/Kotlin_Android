package com.example.kotlinandroid

//코틀린은 최상단에 변수나 함수를 선언할 수 있다.
//최상단에 선언한 변수는 초깃값을 할당해야 한다.

//변수 선언은 <키워드> <이름> : <타입> = <값> 의 형태로 선언한다.
//타입 지정을 하지 않으면 타입 추론을 통해 할당된 값에 맞는 타입으로 설정된다.

val value: Int = 10 //value(val) : 최초 선언 이후에 값이 바뀌지 않는 변수 선언
var variable: Int = 10//variable(var) : 최초 선언 이후에도 새로운 값이 할당될 수 있는 변수 선언

//lateinit과 lazy

lateinit var variable2: String //lateinit : 선언과 동시에 값을 할당하지 않아도 되지만 var 키워드와
                               // Int, Long, Short, Double, Float, Boolean, Byte 타입을 제외한 타입에 사용 가능

val value2: Int by lazy {//lazy : val에 사용 처음으로 변수가 호출되었을 때, 중괄호로 묶인 부분에 적힌 명령을 수행하고 마지막에 있는 값으로 변수를 할당합니다.
    println("by lazy를 통한 값 선언")
    10//변수에 할당되는 값
}

/*fun main() {
    println("밸류2의 값")
    println(value2+10)
}*/

//코틀린의 모든 변수는 "객체"이다. 모든 타입 또한 객체 타입이다. Int는 기초 데이터 타입이 아니라 클래스.
//그러므로 Null값을 할당 가능하며, 자체 메서드도 사용 가능하다.

/*var data: Int = 10

fun main() {
    println(data)
    data = data.plus(10) // 자체 메서드 활용
    println(data)
}*/

//char 타입은 ' '로 값을 할당,
//String 타입은 " "나 """ """로 값을 할당한다. " "은 줄바꿈,들여쓰기를 넣을때 /로 이스케이프 시퀀스를 입력력야 하지만
// """ """은 키보드로 입력한 그대로 문자열로 저장된다. trimIndent()를 통해 앞 공백이 제거된다.
// $변수명이나 ${함수}로 문자열에 변수 값이나 함수 반환값을 넣을 수 있다.

//Any 타입은 코틀린 최상위 클래스로서 정의된 변수에는 어떤 값이든 할당할 수 있다.
//Unit 타입은 반환문이 없는 함수에 반환문이 없다는 것을 명시적으로 알리는 타입이다. 함수 타입을 반환타입 생략 시 저절로 Unit으로 설정된다.
//Noting 타입은 널이나 예외를 반환하는 함수에 사용된다.

//널 허용과 불허용은 변수 타입뒤에 ?을 붙이냐 안 붙이냐로 결정됨
//ex) var data: Int? = null

//함수 설정은 fun <함수명>(<매개변수>:<타입>): <반환 타입>{}로 이루어진다.
//함수를 호출할때 (data = 10) 이런 식으로 이름을 설정해주면 매개변수와 순서가 다르더라도 이름이 같은 변수로 설정된다.

//컬렉션 타입 : 여러 개의 데이터를 표현하는 방법 (List, Array, Set, Map 등이 있음)
//Array 선언 : val data: Array<Int> = Array(<크기>,{<시작 인덱스>})
// 제네릭으로 타입을 선언하지 않는다면 IntArray나 BooleanArray 등의 타입으로 정의할 수 있다.
//arrayOf() 함수를 통해 선언과 동시에 값을 할당할 수 있다. var data = arrayOf<Int> (10,20,30) 또는 intArrayOf(10,20,30)


//List, Map, Set
//List : 순서가 있는 데이터의 집합, 중복 허용 X
//불변 - listOf() 가변 - mutableListOf()
//Set : 순서가 없으며 중복 허용 X
//불변 - setOf() 가변 - mutableSetOf()
//Map : 키와 값으로 이루어진 데이터 집합, 순서가 없고 키의 중복 허용 X Pair("key","value") 형태나 "key" to "value" 형태로 키와 값을 Map에 대입할 수 있다.
//불변 - mapOf() 가변 - mapListOf()

//조건문 반복문
//코틀린 조건문은 표현식으로 사용 가능 -> var data = if(a>0) {
// println("a>0")
// true
// }

//조건문 when : when (변수) {
//조건 -> 명령
//}
//변수값이 조건과 동일하면 -> 오른쪽에 있는 명령을 수행함
//다양한 유형의 조건 : is String - data가 문자열이면
//                  20, 30 - data가 20이거나 30이면
//                  in 1..10 - data가 1~10의 값이면
//                  else
//표현식로도 사용이 가능하며, else를 생략할 수 없음

//반복문 for : for (i in 1..10){ //1부터 10까지 1씩 증가
// sum += i
// }
//형태로 사용됨. for문 조건은
//1..10 - 1부터 10까지 1씩 증가
//1 until 10 - 1부터 9까지 1씩 증가
//1..10 step 2 - 1부터 10까지 2씩 증가
//10 downTo 1 - 10부터 1까지 1씩 감소
//또, 컬렉션 타입의 데이터 개수만큼 반복 가능



