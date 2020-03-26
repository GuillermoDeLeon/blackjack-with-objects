import java.util.ArrayList;

public class Table {
    private static ArrayList<Player> players;
    private static Dealer dealer = new Dealer();

    private static void start(){};
    private static void evaluate(){};

    public static void main(String[] args) {
        Deck testDeck = new Deck();
        Hand testHand = new Hand();

        for (int i = 0; i < 3; i++){
            testDeck.dealCard(testHand);
        }

        for (Card card : testHand.getCurrentHand()){
            System.out.println("card.getWhatCard() = " + card.getWhatCard());
            System.out.println("card.getPointValue() = " + card.getPointValue());
        }

        System.out.println("testHand.getPoints() = " + testHand.getPoints());
    }
}
