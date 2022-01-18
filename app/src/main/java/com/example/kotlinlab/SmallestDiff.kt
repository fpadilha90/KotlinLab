package com.example.kotlinlab

import java.util.*
import kotlin.math.abs

class SmallestDiff {

    fun solution(a1: IntArray, a2: IntArray, target: Int): IntArray {
        val a1Sorted = a1.copyOf(a1.size)
        Arrays.sort(a1Sorted)
        val a2Sorted = a2.copyOf(a2.size)
        Arrays.sort(a2Sorted)

        var i = 0
        var j = a2Sorted.size - 1
        var smallestDiff = abs(a1Sorted[0] + a2Sorted[0] - target) //biggestDiff
        val closestPair = intArrayOf(a1Sorted[0], a2Sorted[0])

        while (i < a1Sorted.size && j >= 0) {
            val v1 = a1Sorted[i]
            val v2 = a2Sorted[j]
            val currentDiff = v1 + v2 - target
            if (abs(currentDiff) < smallestDiff) {
                smallestDiff = abs(currentDiff)
                closestPair[0] = v1
                closestPair[1] = v2
            }
            if (currentDiff == 0) {
                return closestPair
            } else if (currentDiff < 0) {
                i += 1
            } else {
                j -= 1
            }
        }

        return closestPair
    }
}