package com.qualitybitz.booksearchapp.util

class Calculator {

    fun addition(x: Int, y: Int): Int {
        return x + y
    }

    fun subtraction(x: Int, y: Int): Int {
        return x - y
    }

    fun multiplication(x: Int, y: Int): Int {
        return x * y
    }

    fun division(x: Int, y: Int): Int? {
        try {
            return x / y
        } catch (e: Exception) {
            return null
        }
    }
}