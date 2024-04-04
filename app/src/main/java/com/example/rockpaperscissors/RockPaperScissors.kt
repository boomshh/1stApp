package com.example.kotlinbasics

fun main() {
    var comChoice = ""
    var userChoice = ""
    println("Rock, Paper or Scissors? Enter your choice")

    userChoice = readln()
    while(userChoice != "Rock" && userChoice != "Paper" && userChoice != "Scissors") {
        userChoice = readln()
        break
    }

    val randomNum = (1..3).random()

    comChoice = when (randomNum) {
        1 -> {
            "Rock"
        }
        2 -> {
            "Paper"
        }
        else -> {
            "Scissors"
        }
    }

    val winner = when {
        userChoice == comChoice -> "Tie"
        userChoice == "Rock" && comChoice == "Scissors" -> "User"
        userChoice == "Paper" && comChoice == "Rock" -> "User"
        userChoice == "Scissors" && comChoice == "Paper" -> "User"
        else -> "Computer"
    }

    println(comChoice)
    if(winner == "Tie") {
        println("It's a Tie")
    } else {
        println("$winner won")
    }


}
