import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance = 500;
        boolean is_on = true;
        while( is_on) {
            System.out.println("Welcome to your banking app.");
            System.out.println("Choose one of the following: Deposit, Withdrawal, or Balance,");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();

            if (input.equals("deposit")) {
                System.out.println("Enter deposit amount:");
                int deposit = sc.nextInt();
                balance += deposit;
            } else if (input.equals("withdrawal")) {
                System.out.println("Enter withdrawal amount:");
                int withdrawal = sc.nextInt();
                balance -= withdrawal;
            } else {
                System.out.println("Your current balance is:$" + balance);
            }
            if(balance < 0) {
                System.out.println("You have overdrafted. Account closed. ");
                is_on = false;
            }

        }
    }
}