package com.example.kotlinlab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class SmallestDiffTest {

    private lateinit var subject: SmallestDiff

    @BeforeEach
    fun setUp() {
        subject = SmallestDiff()
    }

    @Test
    fun test1() {
        assertArrayEquals(
            intArrayOf(3, 20),
            subject.solution(intArrayOf(-1, 3, 8, 2, 9, 5), intArrayOf(4, 1, 2, 10, 5, 20), 24)
        )
    }

    @Test
    fun test2() {
        assertArrayEquals(
            intArrayOf(4, 8),
            subject.solution(intArrayOf(7, 4, 1, 10), intArrayOf(4, 5, 8, 7), 13)
        )
    }

    @Test
    fun test3() {
        assertArrayEquals(
            intArrayOf(-1, 4),
            subject.solution(intArrayOf(6, 8, -1, -8, -3), intArrayOf(4, -6, 2, 9, -3), 3)
        )
    }

    @Test
    fun test4() {
        assertArrayEquals(
            intArrayOf(-16, 2),
            subject.solution(intArrayOf(19, 14, 6, 11, -16, 14, -16, -9, 16, 13), intArrayOf(13, 9, -15, -2, -18, 16, 17, 2, -11, -7), -15)
        )
    }
}