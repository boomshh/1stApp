package com.example.coffee

fun main() {
    println("Enter num1")
    val num1 = readln().toInt()
    println("Enter num2")
    val num2 = readln().toInt()

    var myResult = add(num1, num2)
    var myResult2 = divide(num1, num2)
    println("plus is $myResult")
    println("the result is $myResult2")


}

fun add(num1: Int, num2: Int) : Int {
    val result = num1 + num2
    return result
}

fun divide(num1 : Int, num2 : Int) : Double {
    return num1.toDouble() / num2.toDouble()
}