import java.util.Random;

/**
 * Created by catherine huang on 12/1/14.
 */
public class Player {

    private String firstName;
    private String lastName;
    private int playerID;


    boolean changeRoom = false;

    /**
     * Constructor
     * @param firstName String
     * @param lastName String
     * @param playerID int
     */
    public Player(String firstName, String lastName, int playerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerID = playerID;
    }

    /**
     * get the player's ID number
     * @return String
     */
    public String getPlayerID(){
        return Integer.toString(playerID);
    }

    /**
     * get the first and last name of the player
     * @return String
     */
    public String getName(){
        return firstName + lastName;
    }

    /**
     * toString method of the Player,
     * returns all the information about this player
     * @return String player information
     */
    @Override
    public String toString(){
        return firstName + " " + lastName + " Player ID: " + playerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (playerID != player.playerID) return false;
        if (firstName != null ? !firstName.equals(player.firstName) : player.firstName != null) return false;
        if (lastName != null ? !lastName.equals(player.lastName) : player.lastName != null) return false;

        return true;
    }

    /**
     * calculates the HashCode of player
     * @return int
     */
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + playerID;
        return result;
    }

    /**
     * Determine if the player want to change room.
     * @return boolean
     */
    public boolean setChangeRoom(){
        Random r = new Random();
        float chance = r.nextFloat();

        if (chance <= 0.30f)
            return changeRoom = false;

        else
            return changeRoom = true;
    }

}//end of Player
