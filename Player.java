/**
 * Created by catherinehuang on 12/1/14.
 */
public class Player {

    private String firstName;
    private String lastName;
    private int playerID;

    public Player(String firstName, String lastName, int playerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerID = playerID;
    }

    public int getPlayerID(){
        return playerID;
    }

    public String getName(){
        return firstName + lastName;
    }

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

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + playerID;
        return result;
    }
}
