package com.example.kotlinlab

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class WarriorTest {

    private lateinit var subject: Warrior

    @BeforeEach
    fun setUp() {
        subject = Warrior("Test")
    }

    @Nested
    @DisplayName("On creation")
    inner class OnCreation {

        @Test fun `Should have a valid name`(){
            assertTrue(subject.name.isNotBlank())
        }

        @Test fun `Should have a valid name 2`(){
            assertTrue(subject.name.isNotBlank())
        }
    }

    @RepeatedTest(3) fun test(){

    }

    @Nested
    @DisplayName("When fighting")
    inner class Fighting {

        @Test fun `Should do damage correctly`(){
            assertTrue(subject.name.isNotBlank())
        }
    }

}