import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       boolean isTrue = true;

        do {
            System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    if(n == 0) {
        System.out.println(n +"! is 1");
    }
    else if (n == 1) {
        System.out.println(n + "! is 1");
    }
    else if (n < 0 ) {
        System.out.println("Factorial is not defined for negative numbers.");
    }
    else {
        for (int i = 1; i < n; ++i)
        {
            temp *= i;
        }
        System.out.println("The factorial of " + n + " is " + temp);
    }

    System.out.println("Calculate another factorial? (yes/no)");
    String result = sc.nextLine();
    isTrue = result.equalsIgnoreCase("yes");

        } while(isTrue);

    }
}
