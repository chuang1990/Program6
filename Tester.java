
import java.util.Random;

/**
 * Created by catherinehuang on 12/4/14.
 */
public class Tester {

    Random r = new Random();
    /**
     *
     * @return
     */
    public boolean changeRoom(){
        float chance = r.nextFloat();

        if (chance <= 0.30f)
            return false;

        return true;
    }


    public static void main(String args[]){
        Random rand = new Random();


        String names[] = {"steph", "paul","catherine","hannah","calvin","ian"};
        String lnames[] = {"conway", "carr","huang","riggs","wong","cullinane"};
        Player[] players = new Player[6];
        Room[] rooms = new Room[3];

        for(int i = 0; i < rooms.length; i++)
            rooms[i] = new Room(Integer.toString(i));

        for(int i = 0; i<names.length; i++) {
            int a = rand.nextInt(2+1);
            players[i] = new Player(names[i], lnames[i], i);
            rooms[a].addPlayer(players[i]);
        }

        for(Room r : rooms) {
            System.out.print("\n"+r.getRoomName()+"\n");
            r.getPlayerInRoom();
        }

//        for(Player p : players) {
//            System.out.print(p.toString()+"\n");
//            System.out.print(p.hashCode()+"\n");
//        }












    }

}
