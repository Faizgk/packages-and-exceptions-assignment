import com.highpeak.assignments.t2017.hps311.faiz.Advisor;
import com.highpeak.assignments.t2017.hps311.faiz.Greeter;

import java.util.ArrayList;

public class GreeterTest {
    public static void main(String[] args) {

        ArrayList<Greeter> arrayList = new ArrayList<Greeter>();

        for(int i=0;i<= args.length-1;i++){

            arrayList.add(new Greeter(args[i]));
            arrayList.get(i).sayHello();
        }

         new Advisor().getAdvise();

        for(int i=args.length-1; i>=0; i--){


            arrayList.get(i).sayGoodBye();

        }

    }
}