import java.util.Scanner;

public class BankApp {


    public static void bankApp(BankAccount bankAccount){


            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            while(true){
                System.out.println("Enter your choice");
                System.out.println("1 -----> Deposit");
                System.out.println("2 -----> Withdrawal");
                System.out.println("3 -----> Balance Enquiry");
                System.out.println("4 -----> Exit");

                choice = scanner.nextInt();

                switch(choice){

                    case 1 :
                        System.out.println("Enter the Deposit Amoount : ");
                        bankAccount.deposit(scanner.nextFloat());
                        break;

                    case 2 :
                        System.out.println("Enter The Amount To Withdraw");
                        bankAccount.withdraw(scanner.nextFloat());
                        break;

                    case 3 :
                        System.out.println("Balance : "+bankAccount.getBalance());
                        break;

                    case 4 : System.exit(0);

                    default:
                        System.out.println("Invalid choice Try Again");


                }
            }



    }
}
