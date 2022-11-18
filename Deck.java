/*
 * This class contains the intial code from Revel.
 * For the sake of maintaining clean code, we
 * committed the necessary changes to transform it into its own object
 */

import java.util.ArrayList;


class Deck {
    private int[] deck = new int[52]; // 52 cards in the game
    private ArrayList<Integer> p1Cards = new ArrayList<Integer>(); // player one's deck
    private ArrayList<Integer> p2Cards = new ArrayList<Integer>(); // player two's deck
    

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


