
import org.junit.jupiter.api.Test; // imports @test annotations
import static org.junit.jupiter.api.Assertions.*; // allows use of assertions

    public class BarrelTest {

//        @Test
//        public void testCreateBarrel() {
//            Barrel barrel = new Barrel("C:\\Users\\HP\\IdeaProjects\\Exercise4_Code\\GiftCardData.txt");
//            assertNotNull(barrel); // verify the barrel object was successfully created
//            assertNotNull(barrel.giftCards); // checks the giftcard array in barrel was successfully initialized
//            assertTrue(barrel.giftCards.length > 0);
//            //assertTrue giftCards array contains at least 1 gift card object
//        }

        @Test
        public void testGetNextGiftCard() {
            Barrel barrel = new Barrel("C:\\Users\\HP\\IdeaProjects\\Exercise4_Code\\GiftCardData.txt");
            GiftCard card = barrel.getNextGiftCard(); // calls getNextGiftCard method to retrieve the nextGiftCard
            assertNotNull(card); // verify operation was successful
        }

        @Test
        public void testIsEmpty() {
            Barrel barrel = new Barrel("C:\\Users\\HP\\IdeaProjects\\Exercise4_Code\\GiftCardData.txt");
            assertFalse(barrel.isEmpty()); // testing isEmpty() to make sure it is returning correctly
            // the barrel should initially be not empty
            while (!barrel.isEmpty()) { //draws all giftcards until the barrel is empty

                barrel.getNextGiftCard();
            }

            assertTrue(barrel.isEmpty()); // verify barrel is now empty after all giftcard objects
                                         // have been drawn
        }
}
