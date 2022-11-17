/*
 * This object contains the intial code from Revel.
 * For the sake of maintaining clean code, Chris
 * committed the necessary changes to transform it into its own object
 */

import java.util.ArrayList;


class Deck {
    private int[] deck = new int[52]; // 52 cards in the game
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // this is used to assign the value (or rank) that each card has
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; // although not important for the actual logic, this enhances the user's experience
    
    
    private ArrayList<Integer> p1Cards = new ArrayList<Integer>();
    private ArrayList<Integer> p2Cards = new ArrayList<Integer>();
    

    

    Deck(){} // default constructor

    public int[] deck(){ // returns the deck whether it has been shuffled and initialized or not 
        return deck;
    }

    public void fillDeck(){ // intializes each element of the array with a number
        for (int i = 0; i < deck.length; i++){
            this.deck[i] = i;
        }
    }

    public ArrayList<Integer> getP1Cards(){ // getter method for player one hand
        return p1Cards;
    }

    public ArrayList<Integer> getP2Cards(){ // getter method for player two hand
        return p2Cards;
    }

    public void setPlayerHands(){ // setter method for both players hands

        for (int i = 0; i < 26; i++){ // since each player gets 26 cards, these two loops split 52 evenly
            this.p1Cards.add(deck[i]);
        }
        
        for (int i = 26; i < 52; i++){
            this.p2Cards.add(deck[i]); 
        }
    }

    public void Shuffle(){ // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index]; 
            deck[index] = temp;
        }
    }

}


// Display two cards -- this code might be useful for when players have to go to war
// for (int i = 0; i < 2; i++) {
//     String suit = suits[deck[i] / 13];
//     String rank = ranks[deck[i] % 13];
//     System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
// }