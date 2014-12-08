
import java.util.Random;

/**
 * Created by catherinehuang on 12/4/14.
 */
public class Tester {

    private Random r = new Random();

    public static void main(String args[]){
        Random rand = new Random();
        Random random = new Random();

        int randomNum = random.nextInt(6+1);


        String names[] = {"steph", "paul","catherine","hannah","calvin","ian"};
        String lnames[] = {"conway", "carr","huang","riggs","wong","cullinane"};
        Player[] players = new Player[6];
        Room[] rooms = new Room[5];

        for(int i = 0; i < rooms.length; i++)
            rooms[i] = new Room(Integer.toString(i));

        for(int i = 0; i<names.length; i++) {
            int a = rand.nextInt(4+1);
            players[i] = new Player(names[i], lnames[i], i);
            rooms[a].addPlayer(players[i]);
            if(rooms[a].roomNumber == Integer.toString(4)){
                System.out.print("Player " + players[i] + " entered execution room.  Player lost the game");
                rooms[5].clearRoom();
            }
            System.out.print("Player " + players[i].getName() + " entered " + rooms[a].getRoomName() +"\n");
        }

//        for(Room r : rooms) {
//            System.out.print("\n"+r.getRoomName()+"\n");
//            r.getPlayerInRoom();
//        }


//        for(Room r: rooms) {
//            //System.out.print(p.toString()+"\n");
//            //System.out.print(p.hashCode()+"\n");
//            for(Player p : players) {
//                System.out.print(r.playerList.get(p.getName()));
//            }
//        }

        int x = 0;

        while(x < 3) {
            for(Room r: rooms) {
                System.out.print(r.clearRoom());
            }
            for(int i = 0; i<names.length; i++) {
                int a = rand.nextInt(4+1);
                players[i] = new Player(names[i], lnames[i], i);
                rooms[a].addPlayer(players[i]);
                if(rooms[a].roomNumber == Integer.toString(4)){
                    System.out.print("Player " + players[i] + " entered execution room.  Player lost the game");
                    rooms[a].clearRoom();
                }
                System.out.print("Player " + players[i].getName() + " moved to " + rooms[a].getRoomName() +"\n");
            }
            for(Room r : rooms) {
            System.out.print("\n"+r.getRoomName()+"\n");
            System.out.print(r.getPlayerInRoom());
            }
            x++;
        }

    }

}// end of Tester
