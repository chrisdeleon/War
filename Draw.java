/*
 * This class is a "converter" whose purpose is to format the used card in to what is called
 * "rank of suit" format (e.g "Ace of Spades", "2 of Hearts", "3 of Diamonds", etc...).
 * 
 */

public class Draw {
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

    Draw(){} // default constructor

    public String converter(Integer cardDrawn){ // converts the card to "rank of suit" format
        String suitConversion = suits[cardDrawn / 13]; // this divides the argument by 13 and find the matching suit
        String rankConversion = ranks[cardDrawn % 13]; // this finds the remainder of the argument and finds the matching rank
        return rankConversion + " of " + suitConversion; // returns string in "rank of suit" format
    }
    
}
