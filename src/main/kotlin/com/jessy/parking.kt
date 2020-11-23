package com.jessy

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter: LocalDateTime = LocalDateTime.of(2020, 12, 25,
     8, 0, 0)
    val leave = LocalDateTime.of(2020, 12, 25,
    10, 8, 0)
    var car = Car("AAA-0001", enter)
    car.leave = leave
    println(car.duration())
    println(Math.ceil(car.duration()/60.0).toLong())
}

class Car(val id:String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
                field = value
        }
    fun  duration() = Duration.between(enter, leave).toMinutes()

}