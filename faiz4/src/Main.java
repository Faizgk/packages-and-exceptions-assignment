import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first and second numbers");

        Number number = new Number(scanner.nextInt(), scanner.nextInt());

        int choice = 0;

        do{
            System.out.println("Enter your choice");
            System.out.println();
            System.out.println("1-->add");
            System.out.println("2-->subtract");
            System.out.println("3-->multiply");
            System.out.println("4-->divide");
             choice  = scanner.nextInt();

            switch(choice){

                case 1 :        System.out.println("Result = "+number.add());
                    break;
                case 2 :        System.out.println("Result = "+number.sub());
                    break;
                case 3 :        System.out.println("Result = "+number.mul());
                    break;
                case 4 :        System.out.println("Result = "+number.div());
                    break;
                default :
                    System.err.println("Invalid choice !  ...try again");
            }

        }while(choice<1 || choice>4);


    }
}