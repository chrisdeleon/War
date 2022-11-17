/*
 * This is the main method
 */

import java.util.Arrays;
import java.util.Scanner;

public class War {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Thank you for playing War!");
        System.out.println("Enter player one name:");
        String p1 = input.nextLine();
        System.out.println("Enter player two name: ");
        String p2 = input.nextLine();

        Players game1 = new Players(); // new game instance

        game1.setPlayerOneName(p1); // sets player one's name based off input
        game1.setPlayerTwoName(p2); // sets player two's name based off input

        System.out.println("Player one name: " + game1.getPlayerOne());
        System.out.println("Player two name: " + game1.getPlayerTwo());


        Deck cards1 = new Deck(); // new deck instance
        cards1.fillDeck(); // fills the deck with numbers
        cards1.Shuffle(); // shuffles the numbers around
        System.out.println(Arrays.toString(cards1.deck()));
        cards1.setPlayerHands(); // split the deck into two decks, one for each player
        System.out.println("These are p1's cards: " + cards1.getP1Cards());
        System.out.println("These are p2's cards: " + cards1.getP2Cards());
        
    }
}
