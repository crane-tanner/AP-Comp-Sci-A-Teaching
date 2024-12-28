import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMaster {
    private Barrel barrel;
    private List<Participant> participants;
    private int maxParticipants;

    public GameMaster(int maxParticipants, String giftCardDataFile) {
        this.maxParticipants = maxParticipants;
        this.barrel = new Barrel(giftCardDataFile);
        this.participants = new ArrayList<>();
    }

    public void startGame(Scanner scanner) {
        createParticipants(scanner);
        assignInitialGifts();
        eliminateHighValueParticipants();
        allowParticipantSwitches(scanner);
        eliminateDuplicateGiftCards();
        determineWinner();
    }

    private void createParticipants(Scanner scanner) {
        System.out.print("Enter the number of participants (max " + maxParticipants + "): ");
        int numParticipants = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numParticipants; i++) {
            System.out.print("Enter the name of participant " + (i + 1) + ": ");
            String name = scanner.nextLine();
            participants.add(new Participant(name, i + 1));
        }
    }

    private void assignInitialGifts() {
        for (Participant participant : participants) {
            System.out.println(participant.getName() + "'s initial GiftCards:");
            for (int i = 0; i < 3; i++) {
                GiftCard card = barrel.getNextGiftCard();
                participant.addGiftCard(card);
                System.out.println(card);
            }
            System.out.println();
        }
    }

    private void eliminateHighValueParticipants() {
        List<Participant> participantsToRemove = new ArrayList<>();
        for (Participant participant : participants) {
            if (participant.getTotalValue() > 3000) {
                participantsToRemove.add(participant);
            }
        }
        participants.removeAll(participantsToRemove);
        System.out.println("Participants eliminated due to high total value.");
    }


    private void allowParticipantSwitches(Scanner scanner) {
        for (Participant participant : participants) {
            System.out.println("\n" + participant.getName() + "'s turn to switch:");
            for (int i = 0; i < 2; i++) {
                System.out.print("Switch GiftCard? (y/n): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    int switchIndex = 0;
                    System.out.print("Enter the index of the card to switch (0, 1, or 2): ");
                    try {
                        switchIndex = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number (0, 1, or 2).");
                        i--;
                        continue;
                    }

                    if (switchIndex < 0 || switchIndex >= participant.getGiftCards().size()) {
                        System.out.println("Invalid index. Please enter a number within the range.");
                        i--;
                        continue;
                    }

                    GiftCard oldCard = participant.getGiftCards().remove(switchIndex);
                    GiftCard newCard = barrel.getNextGiftCard();
                    participant.getGiftCards().add(switchIndex, newCard);
                    System.out.println("Switched " + oldCard + " with " + newCard);
                }
            }

            System.out.println(participant.getName() + "'s updated GiftCards:");
            for (GiftCard card : participant.getGiftCards()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    private void eliminateDuplicateGiftCards() {
        participants.removeIf(this::hasDuplicateCards);
        System.out.println("Participants eliminated due to duplicate GiftCards.");
    }

    private boolean hasDuplicateCards(Participant participant) {
        List<GiftCard> cards = participant.getGiftCards();
        for (int i = 0; i < cards.size() - 1; i++) {
            GiftCard card1 = cards.get(i);
            for (int j = i + 1; j < cards.size(); j++) {
                GiftCard card2 = cards.get(j);
                if (card1.getCategory().equals(card2.getCategory())
                        && card1.getCompany().equals(card2.getCompany())
                        && card1.getMonetaryValue() == card2.getMonetaryValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void determineWinner() {
        if (participants.isEmpty()) {
            System.out.println("No winner. All participants were eliminated.");
            return;
        }

        Participant winner = participants.get(0);
        double lowestTotalValue = winner.getTotalValue();

        for (Participant participant : participants) {
            if (participant.getTotalValue() < lowestTotalValue) {
                winner = participant;
                lowestTotalValue = participant.getTotalValue();
            }
        }

        System.out.println("\nWinner: " + winner.getName());
        System.out.println("Winning GiftCards:");
        for (GiftCard card : winner.getGiftCards()) {
            System.out.println(card);
        }
    }


}
