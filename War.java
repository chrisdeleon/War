/*
 * This is the main method
 */

import java.util.Arrays;
import java.util.Scanner;

public class War {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // added this because VS Code wouldn't stop giving me warnings and it got on my nerves
            System.out.println("Hello! Thank you for playing War!");
            System.out.println("Enter player one name:");
            String p1 = input.nextLine();
            System.out.println("Enter player two name: ");
            String p2 = input.nextLine();

            Players game1 = new Players(); // new game instance

            game1.setPlayerOneName(p1); // sets player one's name based off input
            game1.setPlayerTwoName(p2); // sets player two's name based off input

            System.out.println("*********************************************"); //spacer for readability
            System.out.println("The players are: ");
            System.out.println("Player one name: " + game1.getPlayerOne()); // prints player one's name
            System.out.println("Player two name: " + game1.getPlayerTwo() + "\n"); // prints player two's name


            Deck cards1 = new Deck(); // new deck instance
            cards1.fillDeck(); // fills the deck with numbers
            cards1.Shuffle(); // shuffles the numbers around
            System.out.println("*********************************************"); //spacer for readability
            System.out.println(Arrays.toString(cards1.deck())); // prints the entire shuffled deck as a string
            cards1.setPlayerHands(); // split the deck into two decks, one for each player
            System.out.println("*********************************************"); //spacer for readability
            System.out.println("The player's cards are: ");
            System.out.println(game1.getPlayerOne()+ "'s cards: " + cards1.getP1Cards()); // prints player one's array list
            System.out.println(game1.getPlayerTwo() + "'s cards: " + cards1.getP2Cards()); // prints player two's array list
            System.out.println("*********************************************"); //spacer for readability


            boolean run = true;

            while (run){ // the while-loop tracks when a player reaches 0 cards and the if logic at the end defines the winner AKA the person that has more than 0 cards.
                int p1DrawnCard = cards1.getP1Cards().get(0); // for testing, select the first card in player one's list
                Draw draw1 = new Draw(); // creates instance of the Draw class which converts the card drawn into a readable format for the user
                int p2DrawnCard = cards1.getP2Cards().get(0); // for testing, select the first card in player two's list

                

                // These statements prints the cards that each player drew in a format that the user will understand
                // AKA "rank of suit" format
                System.out.println(game1.getPlayerOne() + " drew: " + draw1.rankConverter(p1DrawnCard) + draw1.suitConverter(p1DrawnCard)); 
                System.out.println(game1.getPlayerTwo() + " drew: " + draw1.rankConverter(p2DrawnCard) + draw1.suitConverter(p2DrawnCard));


                // These variables are primarly for calculating which player drew the card with higher value
                // The numbers don't make sense for human eyes, but they make sense for the computer and the Deck.java object
                int p1CardValue = draw1.getRanks(draw1.rankConverter(p1DrawnCard)); 
                int p2CardValue = draw1.getRanks(draw1.rankConverter(p2DrawnCard));


                // This logic demonstrates which card had a higher value and which player won that round.

                if (p1CardValue > p2CardValue){
                    System.out.println(game1.getPlayerOne() + " wins the round.");
                    // System.out.println(p1DrawnCard + " is greater than " + p2DrawnCard);
                    System.out.println("*********************************************"); //spacer for readability
                    
                    cards1.getP2Cards().remove(0); // removes a card from the losing player's deck
                    cards1.getP1Cards().remove(0); // removes the first card
                    cards1.getP1Cards().add(p1DrawnCard); // adds the card removed from above to the end
                    cards1.getP1Cards().add(p2DrawnCard); // also adds the card that player two played since player one won


                    // Prints remaining cards
                    System.out.println(game1.getPlayerOne()+ "'s remaining cards: " + cards1.getP1Cards()); // prints player one's array list
                    System.out.println(game1.getPlayerTwo() + "'s remaining cards: " + cards1.getP2Cards()); // prints player two's array list



                } else if (p2CardValue > p1CardValue) {
                    System.out.println(game1.getPlayerTwo() + " wins the round.");
                    // System.out.println(p2DrawnCard + " is greater than " + p1DrawnCard);
                    System.out.println("*********************************************"); //spacer for readability


                    cards1.getP1Cards().remove(0); // removes the losing player's card that was used
                    cards1.getP2Cards().remove(0); // removes the first card
                    cards1.getP2Cards().add(p2DrawnCard); // adds the card removed from above to the end
                    cards1.getP2Cards().add(p1DrawnCard); // adds the losing player's card to deck


                    // Prints remaining cards
                    System.out.println(game1.getPlayerOne()+ "'s remaining cards: " + cards1.getP1Cards()); // prints player one's array list
                    System.out.println(game1.getPlayerTwo() + "'s remaining cards: " + cards1.getP2Cards()); // prints player two's array list


                } else { // logic for a tie -- both players are penalized for tying
                    System.out.println("It's a tie! " + p1CardValue + " and " + p2CardValue + " are the same!");
                    cards1.getP1Cards().remove(0);
                    cards1.getP2Cards().remove(0);

                }

                // these if statements track if there is a winner before the loop runs again and executes the corresponding code
                if (cards1.getP1Cards().size() == 0){ 
                    run = false;
                    System.out.println("***************************************************"); //spacer for readability
                    System.out.println("*** Congratulations " + game1.getPlayerTwo() + ". You won the game! ***");
                    System.out.println("***************************************************"); //spacer for readability
                    
                } else if (cards1.getP2Cards().size() == 0){
                    run = false;
                    System.out.println("***************************************************"); //spacer for readability
                    System.out.println("*** Congratulations " + game1.getPlayerOne() + ". You won the game! ***");
                    System.out.println("***************************************************"); //spacer for readability
                }
            }
        } 
    }
}
