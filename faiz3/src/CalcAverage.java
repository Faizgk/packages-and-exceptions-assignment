public class CalcAverage {

    public static double avgFirstN(int N){

        if (N <= 0){

            throw new IllegalArgumentException();
        }
        return (double )(1+N)/2;
    }
}
