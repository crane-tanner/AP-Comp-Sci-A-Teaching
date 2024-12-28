import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParticipantTest {

    @Test
    public void testAddGiftCard() {
        Participant participant = new Participant("Alice", 1);
        GiftCard giftCard1 = new GiftCard("Retail", "eBay", 5.00);
        participant.addGiftCard(giftCard1);
        assertEquals(1, participant.getGiftCards().size());
        assertEquals(giftCard1, participant.getGiftCards().get(0));
    }

    @Test
    public void testGetTotalValue() {
        Participant participant = new Participant("Bob", 1);
        participant.addGiftCard(new GiftCard("Gas", "Shell", 50.0)); // 50.0 * 4 = 200.00
        participant.addGiftCard(new GiftCard("Sports", "Marathon", 20.0));     // 20.0 * 7 = 140.00
        assertEquals(340.00, participant.getTotalValue(), 0.0001);
    }
}
