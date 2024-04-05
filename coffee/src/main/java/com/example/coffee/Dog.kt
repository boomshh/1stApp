package com.example.coffee

class Dog (val name: String, val breed : String, var age: Int = 0)  {

    // 클래스의 객체를 생성하는 순간 실행되는 코드
    init {
        bark(name)
    }

    fun bark(name: String) {
        println("$name says woof woof")
    }
}