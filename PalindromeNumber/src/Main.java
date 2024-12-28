import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int reversed_number = 0;
        // 545
        while(temp > 0) {
            int remainder = temp % 10;
            reversed_number = reversed_number*10 + remainder;
            temp = temp / 10;
            System.out.println(reversed_number);

        }

        if(number == reversed_number) {
            System.out.println("The number is a palindrome. ");
        }
        else {
            System.out.println("The number is not a palindrome");
        }



    }
}