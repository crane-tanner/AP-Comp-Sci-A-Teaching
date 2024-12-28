import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int input = sc.nextInt();
        printTriangle(input);
    }


    public static void printTriangle(int rows) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}