import java.util.Scanner;

public class GiftCardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxParticipants = 5; // Set the maximum number of participants
        GameMaster gameMaster = new GameMaster(maxParticipants, "giftCardData.txt");
        gameMaster.startGame(scanner);
        scanner.close();

    }
}
