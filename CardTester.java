/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("9", "Hearts", 9);
        Card card2 = new Card("9", "Hearts", 9);
        Card card3 = new Card("King", "Clubs", 13);

        System.out.println(card3.toString());

        System.out.println("Card 1 and Card 2 should match: " + card2.matches(card1));
        System.out.println("Card 2 and Card 3 should not match: " + !card2.matches(card3));
    }
}