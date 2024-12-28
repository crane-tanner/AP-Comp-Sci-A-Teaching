import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int firstTerm = 0;
    int secondTerm = 1;
    System.out.println("The fibonacci series for " + n + " terms is: ");

    for(int i = 0; i < n; i++){
        System.out.println(firstTerm + " ");
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;


    }

    }
}