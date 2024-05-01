package com.example.inheritanceapp

class Offspring : Secondary(), Archer, Singer {

    override fun archery() {
        super<Archer>.archery()
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skill enhanced by Offspring")
    }
}