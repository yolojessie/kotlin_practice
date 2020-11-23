package com.jessy

fun main() {
    var s:String? = "abcde" //希望有null 要在資料型態後面加?
    s = null
    println(s?.length) //
    println(s?.get(3)) //取得第幾個字元
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human(66.5f, 1.7f)
    h.hello()
    println(h.bmi())
    val score = 88
    println(score > 60)
    val c :Char = 'A'
    println(c.toInt() > 60)
    /*val age = 19; //不能改動
    var age2 = 20; //自對推斷型態 可改動
    var name : String; // 若沒要先給值就要預設型態*/
}

class Human(var weight: Float, var height:Float, var name: String = ""){
    init {
        println("test $weight")
    }
//    constructor(name:String, weight: Float, height: Float)

    fun bmi() :Float {
        val bmi = weight/(height*height)
        return bmi
    }
    fun hello() {
        println("Hello kotlin")
    }
}