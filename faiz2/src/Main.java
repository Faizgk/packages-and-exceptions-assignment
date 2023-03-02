import esg.itp.shape.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a Polygon   1--> Square   2---> Rectangle");
        int choice = scanner.nextInt();

        if(choice==1){
            System.out.println("Enter the side in cm");
            Main.calculate( new Square(scanner.nextFloat()));

        }
        else if(choice==2){
            System.out.println("Enter the length and breadth in cm");
            Main.calculate(new Rectangle(scanner.nextFloat(), scanner.nextFloat()));

        }
        else{
            System.err.println("Invalid input ! ..try again");
            main(null);
        }


    }

    public static void calculate(Polygon polygon){

        polygon.display();
    }
}