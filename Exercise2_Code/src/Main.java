import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(" \n" +
                "   _____                         _  _      _____                      \n" +
                "  / ____|                      _| || |_   / ____|                     \n" +
                " | |  __ _   _  ___  ___ ___  |_  __  _| | |  __  __ _ _ __ ___   ___ \n" +
                " | | |_ | | | |/ _ \\/ __/ __|  _| || |_  | | |_ |/ _` | '_ ` _ \\ / _ \\\n" +
                " | |__| | |_| |  __/\\__ \\__ \\ |_  __  _| | |__| | (_| | | | | | |  __/\n" +
                "  \\_____|\\__,_|\\___||___/___/   |_||_|    \\_____|\\__,_|_| |_| |_|\\___| \n");

        int max = 10000;
        int min = 1;
        int range = max - min;
        int userGuess;
        int count = 0;
        int random_number;
        boolean is_on = true;

        Scanner sc = new Scanner(System.in);
        random_number = (int)(Math.random() * range) + 1;

        while(is_on) {
            System.out.print("Please enter a number between " + min + " and " + max + ":");
            userGuess = sc.nextInt();
            count += 1;
            if (userGuess > random_number) {
                System.out.println("Your guess is too high, try again.");
                max = userGuess;
            }
            else if(userGuess == random_number) {
                System.out.println("WINNER!");
                is_on = false;
            }
            else {
                System.out.println("Your guess is too low, try again.");
                min = userGuess;
            }
        }
        System.out.println("You guessed " + count + " times.");
    }
}