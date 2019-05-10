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
        int expected = 7;

        assertEquals(expected, fizzBuzzer.fizzBuzz(7));
    }
}