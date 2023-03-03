public class LowSalException extends RuntimeException{

    public String getMessage(){
        return " Basic Salary should not be less than 500 ";
    }
}
