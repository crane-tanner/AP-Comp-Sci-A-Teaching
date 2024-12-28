import java.util.List;
import java.util.ArrayList;

public class Participant{
    private String name;
    private List<GiftCard> giftCards;
    private int playerNumber;

    public Participant(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
        this.giftCards = new ArrayList<>();
    }

    public void addGiftCard(GiftCard giftCard) {
        giftCards.add(giftCard);

    }

    public double getTotalValue() {
        double total = 0.0;
        for(GiftCard card : giftCards) {
            int points = getCategoryPoints(card.getCategory());
            total += points * card.getMonetaryValue();
        }
        return total;
    }
    private int getCategoryPoints(String category) {
        switch(category) {
            case "Entertainment":
                return 1;
            case "Restaurant":
                return 2;
            case "Retail":
                return 3;
            case "Gas":
                return 4;
            case "OnlineShopping":
                return 5;
            case "BeautyAndSpa":
                return 6;
            case "Sports":
                return 7;
            default:
                return 0;
        }
    }
    public List<GiftCard> getGiftCards() {
        List<GiftCard> copy = new ArrayList<>();
        for (GiftCard card : giftCards) {
            copy.add(new GiftCard(card.getCategory(), card.getCompany(), card.getMonetaryValue()));
        }
        return copy;
    }

    public String getName() {
        return name;

    }


}
