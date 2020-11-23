package com.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("Jessy", 77, 88)
    val gstu = GratuateStudent("Jack", 60,60,60)
    gstu.print()
    stu.print()
    println("Highest score: ${stu.highest()}")
}

class GratuateStudent(name: String?, english: Int, math: Int,var thesis: Int) : Student(name, english,math){
    companion object {
        var pass = 70;
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() =
            if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name: String?, var english: Int, var math: Int) {
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            println()
        }
    }

    open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrFailed() =
        if (getAverage() >= 60) "PASS" else "FAILED"

    fun getAverage() = (english + math) / 2


    fun highest() = if (english > math) english else math

}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    var name = scanner.next()
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}

