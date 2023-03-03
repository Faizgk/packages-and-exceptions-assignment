import Exceptions.InsufficientFundsException;
import Exceptions.NegativeAmountException;
import Exceptions.LowBalanceException;
public class BankAccount {
    int accNo;
    String custName;
    String accType;
    float balance;


    public BankAccount(int accNo, String custName, String accType, float balance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType.toLowerCase();

        if(balance<0) throw new NegativeAmountException();

        if(accType.equals("savings") &&balance<1000) throw new LowBalanceException();

        if(accType.equals("current") &&balance<5000) throw new LowBalanceException();

        this.balance = balance;
    }

    void deposit(float amt){

        if(amt<0){
            throw new NegativeAmountException();
        }
        else{
            this.balance = balance + amt;
            System.out.println("Rs."+amt+" Deposited");
        }

    }
    void withdraw(float amt){

        switch(accType){
            case "savings" :

                if(amt<0){
                    throw new NegativeAmountException();
                }
                else if(this.balance-amt < 1000){
                throw new InsufficientFundsException();
                }
                else{
                    System.out.println("Collect Your Cash..");
                }
            break;

            case "current" :

                if(amt<0){
                    throw new NegativeAmountException();
                }
                else if(this.balance-amt < 5000){
                    throw new InsufficientFundsException();
                }
                else{
                    System.out.println("Collect Your Cash..");
                }
                break;


            default:
                System.out.println("Account Not Identified..Please Contact Your Bank");

        }

    }
    float getBalance(){

        return this.balance;

    }

}
