package fizzBuzz;

public class FizzBuzzer {
    public String fizzBuzz(String i) {

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
