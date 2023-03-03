public class IllegalValueException extends RuntimeException{

    @Override
    public String getMessage() {
        return "value cannot be less than zero";
    }
}
