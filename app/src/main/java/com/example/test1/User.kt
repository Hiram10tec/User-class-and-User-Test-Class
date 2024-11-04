package com.example.test1

data class User(var name: String, var age: Int){
    fun Adult(): Boolean {
        return age > 18
    }
    fun Teenager(): Boolean{
        return age in 15..18
    }
    fun Child(): Boolean{
        return age < 13
    }
}