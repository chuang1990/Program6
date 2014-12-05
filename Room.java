import java.util.ArrayList;
import java.util.HashMap;

import java.util.Stack;
/**
 * Created by catherine huang on 12/4/14.
 */
public class Room {


    String roomNumber;

    ArrayList<Integer> playerInRoom = new ArrayList<Integer>();

    public HashMap<Integer, Object> playerList;

    public Room(String number){
        this.playerList = new HashMap<Integer, Object>();
        this.roomNumber = number;
    }

    public String getRoomName(){
        return "Room "+roomNumber+" ";
    }

    public void addPlayer(Player p) {
        playerList.put(p.hashCode(), p);
        playerInRoom.add(p.hashCode());
        System.out.print(p.toString()+" ");
        System.out.print(getRoomName());
    }

    public void removePlayer(Player p){
        playerList.remove(p.hashCode(),p);
    }

    public void getPlayerInRoom(){
        //StringBuilder sb = new StringBuilder("");
        if(playerList.size()==0)
            System.out.print("EMPTY!");
        for(int i = 0; i< playerList.size(); i++){
           //String key = playerList.get(playerInRoom.peek()).toString();
           // System.out.print(key);
           System.out.print(playerList.get(playerInRoom.get(i))+"");
            //sb.append(playerList.get(key)+"");
        }
        //return sb.toString();
    }
}
