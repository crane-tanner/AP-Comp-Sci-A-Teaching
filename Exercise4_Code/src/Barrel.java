import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Barrel {
    private List<GiftCard> giftCards;
    private Random random;

    public Barrel(String filename) {
        this.giftCards = new ArrayList<>();
        this.random = new Random();
        loadGiftCardsFromFile(filename);
        shuffle();
    }

    private void loadGiftCardsFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                String category = data[0];
                String company = data[1];
                double value = Double.parseDouble(data[2]);
                giftCards.add(new GiftCard(category, company, value));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found: " + filename);
        }
    }

    private void shuffle() {
        Collections.shuffle(giftCards, random);
    }

    public GiftCard getNextGiftCard() {
        if (giftCards.isEmpty()) {
            throw new RuntimeException("Barrel is empty.");
        }
        int randomIndex = random.nextInt(giftCards.size());
        GiftCard drawnCard = giftCards.remove(randomIndex);
        return drawnCard;
    }

    public boolean isEmpty() {
        return giftCards.isEmpty();
    }
}