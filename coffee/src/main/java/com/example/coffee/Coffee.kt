package com.example.coffee

fun main() {

    // Immutable List - you cannot add items after the initilization
    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // Mutable List - you can add items later and midify
    val shoppingList2 = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")

    shoppingList2.add("Cooling System")
    println(shoppingList2)
    shoppingList2.remove("RAM")
    println(shoppingList2)
    shoppingList2.removeAt(2)
    println(shoppingList2)
    shoppingList2.add(2, "RAM")
    println(shoppingList2)
    println(shoppingList2[2])

    shoppingList2[2] = "ADD"
    shoppingList2.set(1, "Water Cooling")
    println(shoppingList2)

    val hasRAM = shoppingList2.contains("RAM")
    if(hasRAM) {
        println("Has RAM in the list")
    } else {
        println("No RAM in the List")
    }

    for(index in 0..shoppingList2.size - 1) {
        println("item ${shoppingList2[index]} is at index $index")
    }

    println(shoppingList2)
}



/*
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
*/
