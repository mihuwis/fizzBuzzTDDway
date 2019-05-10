package fizzBuzz;

import fizzBuzz.customExceptions.InvalidInputException;

public class FizzBuzzer {
    public String fizzBuzz(String i) throws InvalidInputException {

        if(Integer.valueOf(i) < 0) {
            throw new InvalidInputException();
        }

        if (i.equals("0")) {
            return "0";
        }

        if (Integer.valueOf(i) % 3 == 0 && Integer.valueOf(i) % 5 == 0) {
            return "FizzBuzz";
        } else if (Integer.valueOf(i) % 3 == 0) {
            return "Fizz";
        } else if (Integer.valueOf(i) % 5 == 0) {
            return "Buzz";
        }
        return i;
    }
}
