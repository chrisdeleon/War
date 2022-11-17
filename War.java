import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class war {
    public static void main(String[] args) {

        // INITIAL CODE FROM REVEL
        
        int[] deck = new int[52]; // 52 cards in the game
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; // although not important for the actual logic, this enhances the user's experience
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // this is used to assign the value (or rank) that each card has
            
        // Initialize cards
        for (int i = 0; i < deck.length; i++){
            deck[i] = i;
        }
        
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index]; 
            deck[index] = temp;
        }


        Split(deck); // runs the split function and passes the deck as an argument

        ArrayList<Integer> playerOneDeck = new ArrayList<Integer>();
        ArrayList<Integer> playerTwoDeck = new ArrayList<Integer>();

        for (int i = 0; i < 26; i++){
            playerOneDeck.add(deck[i]); 
        }

        for (int i = 26; i < 52; i++){
            playerTwoDeck.add(deck[i]); 
        }

        System.out.println("Player one: " + playerOneDeck); // prints player one's entire deck
        System.out.println("Player two: " + playerTwoDeck); // prints player one's entire deck


        System.out.println("Entire deck: " + Arrays.toString(deck)); // print the entire randomized deck

        // Display two cards -- this code might be useful for when players have to go to war
        for (int i = 0; i < 2; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }



    public static void Split(int[] deck){ // this method splits the shuffled deck of cards and loads them into an array list for each player
        
    }
}
