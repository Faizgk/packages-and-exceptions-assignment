public class DivideByZeroException extends ArithmeticException{

    @Override
    public String getMessage() {
        return "Cant Divide By Zero";
    }
}
