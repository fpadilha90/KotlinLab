package com.example.kotlinlab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class SmallestTest {

    private lateinit var subject: Smallest

    @BeforeEach
    fun setUp() {
        subject = Smallest()
    }

    @Test
    fun test1() {
        assertEquals(5, subject.solution(intArrayOf(1, 3, 6, 4, 1, 2)))
    }

    @Test
    fun test2() {
        assertEquals(1, subject.solution(intArrayOf(-1, -3)))
    }
}