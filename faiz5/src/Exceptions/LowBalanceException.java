package Exceptions;

public class LowBalanceException extends RuntimeException{

    public String getMessage(){

        return "Balance Amount is Below Minimum Required Balance";
    }
}
