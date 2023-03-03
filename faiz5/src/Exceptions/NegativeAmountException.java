package Exceptions;

public class NegativeAmountException extends RuntimeException{
    public String getMessage(){
        return "Negative Amount Can't Be Processed";
    }
}
