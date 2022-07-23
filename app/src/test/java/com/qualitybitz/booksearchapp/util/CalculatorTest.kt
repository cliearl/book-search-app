package com.qualitybitz.booksearchapp.util

import androidx.test.filters.SmallTest
import com.google.common.truth.Truth
import org.junit.After
import org.junit.Before
import org.junit.Test


@SmallTest
class CalculatorTest {
    //    private val calculator = Calculator()
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun `additional function test`() {
        // Given
        val x = 4
        val y = 2

        // When
        val result = calculator.addition(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(6)
    }

    @Test
    fun `subtraction function test`() {
        // Given
        val x = 4
        val y = 2

        // When
        val result = calculator.subtraction(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(2)
    }

    @Test
    fun `multiplication function test`() {
        // Given
        val x = 4
        val y = 2

        // When
        val result = calculator.multiplication(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(8)
    }

    @Test
    fun `division function test`() {
        // Given
        val x = 4
        val y = 0

        // When
        val result = calculator.division(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(null)
    }
}