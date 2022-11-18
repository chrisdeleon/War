import java.util.Arrays;

/*
 * This class is a "converter" whose purpose is to format the used card in to what is called
 * "rank of suit" format (e.g "Ace of Spades", "2 of Hearts", "3 of Diamonds", etc...).
 * The reason why suitConverter and rankConverter are separate methods instead of a consolidated one is 
 * because for the gameplay, the winning card is based solely on the one with a higher rank. 
 * Card suit is purely for enhancing the user's experience.
 * 
 */

public class Draw {
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};


    public String suitConverter(Integer cardDrawn){ // converts the card drawn into its corresponding suit
        String suitConversion = suits[cardDrawn / 13]; // this divides the argument by 13 and find the matching suit
        return " of " + suitConversion; // returns string in " of suit" format
    }

    public String rankConverter(Integer cardDrawn){
        String rankConversion = ranks[cardDrawn % 13]; // this finds the remainder of the argument and finds the matching rank
        return rankConversion;
    }

    public int getRanks(String string){ // gets the ranks array which is then used to determine who wins the round in the main method
        return Arrays.asList(ranks).indexOf(string);
    }
    
}
