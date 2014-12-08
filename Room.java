import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by catherine huang on 12/4/14.
 */
public class Room {


    String roomNumber;

    ArrayList<String> playerInRoom = new ArrayList<String>();

    public HashMap<String, Object> playerList;


    /**
     * Constructor
     * @param number String
     */
    public Room(String number){
        this.playerList = new HashMap<String, Object>();
        this.roomNumber = number;
    }

    /**
     * returns the name of the Room
     * @return String room name
     */
    public String getRoomName(){
        return "Room "+roomNumber+" ";
    }

    /**
     * adds player to the room
     * @param p Player
     */
    public void addPlayer(Player p) {
        playerList.put(p.getName(), p);
        playerInRoom.add(p.getName());
//        System.out.print(p.toString()+" ");
//        System.out.print(getRoomName());
    }

    public void removePlayer(Player p){
        playerList.remove(p.hashCode(),p);
    }

    /**
     * prints out the player in the room.
     */
    public String getPlayerInRoom(){
        String playersString = "Players in Room " + roomNumber + ":\n";
        if(playerList.size()==0)
            playersString += "EMPTY!\n";
        for(int i = 0; i< playerList.size(); i++){
           //String key = playerList.get(playerInRoom.peek()).toString();
           // System.out.print(key);
           playersString += playerList.get(playerInRoom.get(i))+"\n";
            //sb.append(playerList.get(key)+"");
        }
        return playersString;
        //return sb.toString();
    }


//    public ArrayList<String> movePlayers() {
//        if(playerInRoom.size() == 0) {
//            return null;
//        }
//        else {
//            ArrayList<String> tempList = new ArrayList<String>();
//            for(String p: playerList) {
//                Player tempPlayer = playerList.get(p);
//                if() {
//                    tempList.add(p.getName());
//                    playerList.remove(p.getName());
//                    playerInRoom.remove(p);
//                }
//            }
//            return tempList;
//        }
//    }

    /**
     * empty the room
     * @return String
     */
    public String clearRoom(){
        if(playerList.size() == 0)
            return "Nothing to delete\n";
        for(String playerCode: playerInRoom){
            playerList.remove(playerCode);
        }
        playerInRoom.clear();
        return "Room Emptied\n";
    }



}//end of Room
