import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter value 1 and value 2");

        UserTrail userTrail = new UserTrail(scanner.nextInt(), scanner.nextInt());

        System.out.println(userTrail.show());
    }
}