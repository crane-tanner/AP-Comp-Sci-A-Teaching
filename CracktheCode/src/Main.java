import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        do {
            System.out.println("Welcome. What is your name?");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            System.out.println("Hello " + name + ", are you ready to crack the code?");
            String move_forward = sc.next();

            if (move_forward.equals("yes")) {
                System.out.println("Phase 1");
                System.out.println("Enter a string: ");
                String user_input1 = sc.next();

                if (user_input1.length() == 3) {
                    System.out.println("Correct!\n");
                    System.out.println("Enter a number: ");
                    int user_input2 = sc.nextInt();

                    if (user_input2 == 19 || user_input2 >= 35 && user_input2 < 78) {
                        System.out.println("Correct!\n");
                        System.out.println("Enter a number: ");
                        int user_input3 = sc.nextInt();

                        if(user_input3 % 10 == 1 || user_input3 > 0 &&user_input3 % 2 == 0) {
                            System.out.println("Correct!\n");
                            System.out.println("You have successfully cracked the code!");
                            isTrue = false;
                        }
                        else { System.out.println("Sorry that was incorrect!");
                            System.out.println("Better luck next time!");
                        }
                    } else {
                        System.out.println("Sorry that was incorrect!");
                        System.out.println("Better luck next time!\n");
                    }


                } else {
                    System.out.println("Sorry that was incorrect!");
                    System.out.println("Better luck next time!\n");
                }
            }

            else {isTrue = false;}

        } while(isTrue);

    }
}