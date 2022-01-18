package com.example.kotlinlab

class Pollution {

    fun solution(A: IntArray): Int {
        val doubleArray = A.map { it.toDouble() }.toMutableList()

        var actual = doubleArray.sum()
        val target = actual / 2

        var filters = 0

        doubleArray.sort()
        var index = doubleArray.size - 1
        while (actual > target) {
            val reduction = doubleArray[index] / 2

            doubleArray[index] = reduction
            actual -= reduction
            filters++

            if (doubleArray[index] < doubleArray[index - 1]) index--
            if (doubleArray[index] < doubleArray[doubleArray.size - 1]) {
                doubleArray.sort()
                index = doubleArray.size - 1
            }
        }

        return filters
    }

    fun bruteForceSolution(A: IntArray): Int {
        var doubles = A.map { it.toDouble() }.toMutableList() //*

        var current = doubles.sum() //*
        val target = current / 2

        var filters = 0
        while (current > target) {
            doubles.sort() //*

            val reduced = doubles[0] / 2
            doubles[0] = reduced
            current -= reduced

            filters++
        }

        return filters
    }


}

