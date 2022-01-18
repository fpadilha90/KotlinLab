package com.example.kotlinlab

import java.lang.StringBuilder

class Crop {
    fun solution(message: String, K: Int): String {
        val sb = StringBuilder()
        val split = message.split(" ".toRegex())

        for(i in split){
            if ((sb.length + i.length) <= K) sb.append("$i ")
            else break
        }

        return sb.toString().trim()
    }

}