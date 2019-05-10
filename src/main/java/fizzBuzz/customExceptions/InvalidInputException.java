package fizzBuzz.customExceptions;

public class InvalidInputException extends Throwable {

    public InvalidInputException(){
        System.out.println("Input cannot be lower then zero");
    }
}
