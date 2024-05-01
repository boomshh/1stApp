package com.example.inheritanceapp

// Baseclass 의 파생 클래스
// Baseclass 상속 받음
open class Secondary : BaseClass() {

    override fun role() {
//        super.role()
        println("Knight of the House of Baseclass")
    }



}