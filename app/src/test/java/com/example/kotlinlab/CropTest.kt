package com.example.kotlinlab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CropTest {

    private lateinit var subject: Crop

    @BeforeEach
    fun setUp() {
        subject = Crop()
    }

    @Test
    fun test1() {
        assertEquals("Codility We", subject.solution("Codility We test coders", 14))
    }

    @Test
    fun test2() {
        assertEquals("Why not", subject.solution("Why not", 100))
    }

    @Test
    fun test3() {
        assertEquals("The quick brown fox jumps over the lazy", subject.solution("The quick brown fox jumps over the lazy dog", 39))
    }
}