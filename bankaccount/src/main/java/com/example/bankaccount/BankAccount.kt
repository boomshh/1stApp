package com.example.bankaccount

class BankAccount(var accountHolder: String, var balance : Double) {

    private val transactionHistory = mutableListOf<String>()

    // 입금
    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")

    }

    // 출금
    fun withdraw(amount: Double) {
        if(amount <= balance) {
            // we can withdraw
            balance -= amount
            transactionHistory.add("$accountHolder withdraw $$amount")
        } else {
            // we cannot withdraw money
            println("You don't have the funds to withdraw $$amount")
        }
    }

    // 거래 내역
    fun displayTransaction() {

        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory) {
            println(transaction)
        }
    }
}