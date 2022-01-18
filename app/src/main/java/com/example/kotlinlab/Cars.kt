package com.example.kotlinlab

class Cars {

    fun solution(P: IntArray, S: IntArray): Int {
        var people = P.sum()
        var cars = 0
        S.sortDescending()
        for (i in S){
            if (people <= 0) break

            people -= i
            cars++
        }

        return cars
    }
}