package com.example.bankaccount

fun main() {

    val bankAccount = BankAccount("ethan", 2131.2)

    bankAccount.deposit(200.0)
    bankAccount.withdraw(100.0)
    bankAccount.deposit(2000.0)
    bankAccount.withdraw(1000.0)

    bankAccount.displayTransaction()
    println("${bankAccount.accountHolder}'s balance ${bankAccount.balance}")
}
