import java.util.Scanner;

public class Unit1 {
    public static int project1() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        num = sc.nextInt();
        num += 10;
        return num;
    }
}
