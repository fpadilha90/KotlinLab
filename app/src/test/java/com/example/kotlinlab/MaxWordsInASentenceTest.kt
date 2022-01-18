package com.example.kotlinlab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class MaxWordsInASentenceTest {

    private lateinit var subject: MaxWordsInASentence

    @BeforeEach
    fun setUp() {
        subject = MaxWordsInASentence()
    }

    @Test
    fun test1() {
        assertEquals(4, subject.solution("We test coders. Give us a try?"))
    }

    @Test
    fun test2() {
        assertEquals(2, subject.solution("Forget  CVs..Save Time . x x"))
    }
}