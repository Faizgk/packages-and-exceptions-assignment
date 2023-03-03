import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter employee id");
        int empId = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter employee name");
        String empName = scanner.nextLine();

        System.out.println("enter employee designation ");
        String designation = scanner.nextLine().toLowerCase();

        System.out.println("enter employee's basic");
        int basic = scanner.nextInt();

        Emp emp = new Emp(empId, empName, designation, basic);

        while(true){

            System.out.println("enter your choice :  1--> display Employee Details  |   2--> calculate employee HRA   |   3---> exit");
            int choice = scanner.nextInt();
            if(choice==1) emp.printDET();
            else if (choice==2) emp.calculateHRA();
            else if (choice==3) System.exit(0);
            else  System.err.println(" Invalid Choice..Try again");

        }
    }
}