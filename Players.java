/*
 * This class is used to declare, get, and set each players' name
 */

class Players {
    private String playerOne;
    private String playerTwo;

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
}