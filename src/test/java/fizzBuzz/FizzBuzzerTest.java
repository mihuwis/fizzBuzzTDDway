package fizzBuzz;

import fizzBuzz.customExceptions.InvalidInputException;
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
    public void testIntReturn() throws InvalidInputException {
        String expected = "7";

        assertEquals(expected, fizzBuzzer.fizzBuzz("7"));
    }

    @Test
    public void testIfDivisorBy3ReturnsFizz() throws InvalidInputException {
        String expected = "Fizz";

        assertEquals(expected, fizzBuzzer.fizzBuzz("6"));
    }

    @Test
    public void testIfDivisorBy5And3ReturnsFizzBuzz() throws InvalidInputException {
        String expected = "FizzBuzz";

        assertEquals(expected, fizzBuzzer.fizzBuzz("15"));
    }

    @Test
    public void testZero() throws InvalidInputException {
        String expected = "0";

        assertEquals(expected, fizzBuzzer.fizzBuzz("0"));
    }

    @Test
    public void testExcptionOnBellowZeroValue() throws InvalidInputException {

        assertThrows(InvalidInputException.class, () -> fizzBuzzer.fizzBuzz("-10"));
    }
}