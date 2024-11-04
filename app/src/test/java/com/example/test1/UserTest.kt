package com.example.test1

import org.junit.Assert.assertTrue
import org.junit.Test

class UserTest {

    @Test
    fun testAdult() {
        val user = User("Hiram", 21)
        assertTrue(user.Adult())
    }

    @Test
    fun testTeen() {
        val user = User("Hiram", 17)
        assertTrue(user.Teenager())
    }
    @Test
    fun testChild(){
        val user = User("Nico", 2)
        assertTrue(user.Child())
    }

}