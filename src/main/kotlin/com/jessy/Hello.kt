package com.jessy

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    val age = 19; //不能改動
    var age2 = 20; //自對推斷型態 可改動
    var name : String; // 若沒要先給值就要預設型態
}

class Human{
    fun hello() {
        println("Hello kotlin")
    }
}