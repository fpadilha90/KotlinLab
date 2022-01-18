package com.example.kotlinlab

class Smallest {


    fun solution(A: IntArray): Int {
        for (i in 1..100_000) {
            if (!A.contains(i)) return i
        }
        return 100_000
    }
}