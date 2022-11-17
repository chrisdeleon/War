/*
 * This class is used to declare, get, and set each players' name
 */
import java.util.ArrayList;

class Players {
    private String playerOne;
    private String playerTwo;
    private ArrayList<String> p1Cards = new ArrayList<String>();
    private ArrayList<String> p2Cards = new ArrayList<String>();


    Players(){} // default constructor

    Players(String playerOneName, String playerTwoName){
        playerOne = playerOneName;
        playerTwo = playerTwoName;
    }

    public String getPlayerOne(){ // getter method for player one name
        return playerOne;
    }

    public String getPlayerTwo(){ // getter method for player two name
        return playerTwo;
    }

    public void setPlayerOneName(String newName){ // setter for player one's name
        this.playerOne = newName;
    }

    public void setPlayerTwoName(String newName){ // setter for player two's name
        this.playerTwo = newName;
    }

    public void setPlayerOneList(ArrayList<String> newList){
        this.p1Cards = newList;
    }

    public void setPlayerTwoList(ArrayList<String> newList){
        this.p2Cards = newList;
    }
}