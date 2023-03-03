public class Number {

    int firstNumber;
    int secondNumber;
    double result;

    public Number(int x, int y){
    this.firstNumber = x;
    this.secondNumber = y;
    }

    public double add(){
        this.result = firstNumber + secondNumber;
        return result;

    }
    public double sub(){
        this.result = firstNumber - secondNumber;
        return result;

    }
    public double mul(){
        result = firstNumber * secondNumber;
        return this.result;
    }
    public double div(){

       if(secondNumber == 0){
            throw new DivideByZeroException();
        }
        this.result = (double) firstNumber / secondNumber;
        return result;

    }

}
