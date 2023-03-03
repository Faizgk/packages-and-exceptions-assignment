import java.util.Random;
import java.util.Scanner;

public class BankAccountCreator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===Bank Account Creation Application Desk==");

        System.out.println("Enter your name : ");
        String cust_name =  scanner.nextLine();

        int choice = 0;

        String accType = "NIL";
        do{
            System.out.println("Choose your preferred account Type  press 1 for Savings  ||  press 2 for Current");

            choice = scanner.nextInt();
            if(choice==1){
                accType = "savings";
            } else if (choice ==2) {
                accType = "current";
            }
            else{
                System.err.println("Invalid Choice..try again");
            }
        }while(choice!=1 && choice!=2);


        System.out.println("Enter your Initial Deposit Amount?");
        float balance = scanner.nextFloat();

        Random random = new Random();

        int acc_no = Math.abs(448*100 + random.nextInt()*10 + random.nextInt()*10);

        System.out.println("Your Account Number is "+acc_no);

        BankAccount bankAccount = new BankAccount((int) acc_no, cust_name, accType, balance);

        System.out.println("Opening Bank App...");

        BankApp.bankApp(bankAccount);
    }
}