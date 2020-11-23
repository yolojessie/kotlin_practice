package com.jessy

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://www.youtube.com/watch?v=EzF5uqdWmQE");
    println(url.readText())
    /*with (url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }

    }*/



}