import java.text.NumberFormat;
import java.util.Scanner;

// M = P(i(1+i)^n)/(1+i)^n-1) formula used for calculation
// p = principal loan amount
// i  = monthly interest rate
// n = number of months

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (%): ");
        float annualInterestRate = scanner.nextFloat();


        System.out.println("Enter the length of mortgage (years): ");
        int yearsOfLoan = scanner.nextInt();
        float monthlyInterestRate = annualInterestRate/12;
        float monthsOfLoan = yearsOfLoan*12;

        double mortgage_payment = principal*(
                (monthlyInterestRate*
                        Math.pow((1+monthlyInterestRate),monthsOfLoan)))/
                (Math.pow((1+monthlyInterestRate),monthsOfLoan)-1);

        double total_payments = (mortgage_payment*monthsOfLoan);

        System.out.print("Your monthly payment is: " +
                NumberFormat.getCurrencyInstance().format(mortgage_payment));

        System.out.println("\nTotal payback amount: " +
                NumberFormat.getCurrencyInstance()
                        .format(total_payments ));
    }

}