package fizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzerTest {

    FizzBuzzer fizzBuzzer;

    @BeforeEach
    public void createInstance() {
        this.fizzBuzzer = new FizzBuzzer();
    }

    @Test
    public void testIntReturn() {
        String expected = "7";

        assertEquals(expected, fizzBuzzer.fizzBuzz("7"));
    }

    @Test
    public void testIfDivisorBy3ReturnsFizz() {
        String expected = "Fizz";

        assertEquals(expected, fizzBuzzer.fizzBuzz("6"));
    }

    @Test
    public void testIfDivisorBy5And3ReturnsFizzBuzz() {
        String expected = "FizzBuzz";

        assertEquals(expected, fizzBuzzer.fizzBuzz("15"));
    }
}