package com.example.coffee

fun main() {

    println("Who is this coffee for?")
    val name = readln()

    println("how many pieces of sugar do you want?")
    val sugarCount = readln().toInt()

    // Call Function
    makeCoffee(sugarCount, name)
}

// Define Function
fun makeCoffee(sugarCount: Int, name : String) {

    if(sugarCount == 1) {
        println("$name, Coffee with $sugarCount spoon of sugar")
    } else if(sugarCount == 0) {
        println("Coffee with no sugar for $name")
    }
    else {
        println("$name, Coffee with $sugarCount spoons of sugar ")
    }

}