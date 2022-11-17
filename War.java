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

        System.out.println("Player one name: " + game1.getPlayerOne()); // prints player one's name
        System.out.println("Player two name: " + game1.getPlayerTwo()); // prints player two's name


        Deck cards1 = new Deck(); // new deck instance
        cards1.fillDeck(); // fills the deck with numbers
        cards1.Shuffle(); // shuffles the numbers around
        System.out.println(Arrays.toString(cards1.deck())); // prints the entire shuffled deck as a string
        cards1.setPlayerHands(); // split the deck into two decks, one for each player
        System.out.println("These are p1's cards: " + cards1.getP1Cards()); // prints player one's array list
        System.out.println("These are p2's cards: " + cards1.getP2Cards()); // prints player two's array list



        int turnCounter = 0;

        do{

            int p1DrawnCard = cards1.getP1Cards().get(0); // for testing, select the first card in player's one list
            Draw draw1 = new Draw();
            System.out.println(draw1.converter(p1DrawnCard)); // prints the card in "rank of suit" format
            turnCounter++; // adds 1 to the counter so that a new card index may be parsed
        } while(cards1.getP1Cards().size() != 0 || cards1.getP2Cards().size() != 0);

        /* the purpose of the do-while loop is to track when a player's deck is at 0 which would then 
         * initiate the logic to determine which player is the winner
         */

        if (cards1.getP1Cards().size() == 0){ // this logic displays the winner based off when a player has zero cards
            System.out.println("Congratulations " + game1.getPlayerTwo() + ". You won the game!");
        } else {
            System.out.println("Congratulations " + game1.getPlayerOne() + ". You won the game!");
        }

        

        



        
    }
}
