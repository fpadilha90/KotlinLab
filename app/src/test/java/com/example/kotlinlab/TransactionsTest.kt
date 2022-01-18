package com.example.kotlinlab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class TransactionsTest {

    private lateinit var subject: Transactions

    @BeforeEach
    fun setUp() {
        subject = Transactions()
    }

    @Test
    fun test1() {
        assertEquals(
            230, subject.solution(
                arrayOf(100, 100, 100, -10),
                arrayOf("2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29")
            )
        )
    }

    @Test
    fun test2() {
        assertEquals(
            25, subject.solution(
                arrayOf(180, -50, -25, -25),
                arrayOf("2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31")
            )
        )
    }

    @Test
    fun test3() {
        assertEquals(
            -164, subject.solution(
                arrayOf(1, -1, 0, -105, 1),
                arrayOf("2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12")
            )
        )
    }

    @Test
    fun test4() {
        assertEquals(
            80, subject.solution(
                arrayOf(100, 100, -10, -20, -30),
                arrayOf("2020-01-01", "2020-02-10", "2020-02-11", "2020-02-05", "2020-02-08")
            )
        )
    }
}