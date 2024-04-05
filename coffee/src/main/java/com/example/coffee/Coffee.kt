package com.example.coffee

data class CoffeeDetails(
    val sugarCount: Int,
    val name : String,
    val size : String,
    val creamAmount : Int)

fun main() {

    // Creating an object/instance of the class Dog
    var cloud = Dog("Daisy", "dwarf poodle", 14)

    println("${cloud.name} is a ${cloud.breed} and is ${cloud.age} years old")
    println("A year has passed")
    cloud.age = 2
    println("${cloud.name} is a ${cloud.breed} and is ${cloud.age} years old")

    val coffeeForDenis = CoffeeDetails(12, "denis", "xxl", 0)
    makeCoffee(coffeeForDenis)

}


fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()

    println("how many pieces of sugar do you want?")
    val sugarCount = readln().toInt()

    // Call Function
//    makeCoffee(sugarCount, name)
}

// Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails) {

    when (coffeeDetails.sugarCount) {
        1 -> {
            println("${coffeeDetails.name}, Coffee with ${coffeeDetails.sugarCount} spoon of sugar" + "and cream : ${coffeeDetails.creamAmount}")
        }
        0 -> {
            println("Coffee with no sugar for ${coffeeDetails.name}" + "and cream : ${coffeeDetails.creamAmount}")
        }
        else -> {
            println("${coffeeDetails.name}, Coffee with ${coffeeDetails.sugarCount} spoons of sugar " + "and cream : ${coffeeDetails.creamAmount}")
        }
    }

}