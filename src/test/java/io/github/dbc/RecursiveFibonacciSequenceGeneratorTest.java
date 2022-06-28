package io.github.dbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveFibonacciSequenceGeneratorTest {

    private RecursiveFibonacciSequenceGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new RecursiveFibonacciSequenceGenerator();
    }

    @ParameterizedTest(name = "fibonacci({0}) = {1}")
    @CsvSource(value = {
            "0, 0", "1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "7, 13", "8, 21", "9, 34", "10, 55",
            "11, 89", "12, 144", "13, 233", "14, 377", "15, 610", "16, 987", "17, 1597", "18, 2584", "19, 4181", "20, 6765"
    })
    void fibonacci(int number, int expected) {
        assertEquals(expected, generator.calculateFibonacciNumber(number));
    }
}