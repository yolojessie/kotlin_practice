package com.jessy

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    var counter = 1
    /*var ms = measureTimeMillis {
        for (n in 1..100_000) {
            thread {
                counter++
            }
        }
    }*/

    // Coroutines faster than Thread
    var ms = measureTimeMillis {
        for (n in 1..100_000) {
            GlobalScope.launch {
                counter++
            }
        }
    }
    println(ms)
}