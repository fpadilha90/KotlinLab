package com.example.kotlinlab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CarsTest {

    private lateinit var subject: Cars

    @BeforeEach
    fun setUp() {
        subject = Cars()
    }

    @Test
    fun test1() {
        assertEquals(2, subject.solution(intArrayOf(1, 4, 1), intArrayOf(1, 5, 1)))
    }

    @Test
    fun test2() {
        assertEquals(3, subject.solution(intArrayOf(4,4,2,4), intArrayOf(5,5,2,5)))
    }

    @Test
    fun test3() {
        assertEquals(2, subject.solution(intArrayOf(2,3,4,2), intArrayOf(2,5,7,2)))
    }
}