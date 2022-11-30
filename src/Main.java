import models.Groups;
import models.Players;
import models.Teams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Players p1 = new Players("Neymar Jr.", 30, 89, 345);
        Players p2 = new Players("C. Ronaldo", 37, 90, 332);
        Players p3 = new Players("K. MBappe", 23, 91, 387);
        Players p4 = new Players("R. Lewandowski", 34, 91, 361);
        Players p5 = new Players("Lionel Messi", 35, 91, 356);

        ArrayList<Players> players = new ArrayList<Players>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);

        //Teams

        Teams t1 = new Teams("Brazil", "Yellow", 1);
        Teams t2 = new Teams("Argentina", "Blue", 4);
        Teams t3 = new Teams("Portugal", "Red", 16);

        ArrayList<Players> brazilPlayers = new ArrayList<Players>();
        ArrayList<Players> argentinaPlayers = new ArrayList<Players>();
        ArrayList<Players> portugalPlayers = new ArrayList<Players>();

        Players b1 = new Players("Neymar Jr.", 30, 89, 345);
        Players b2 = new Players("T. Silva", 38, 86, 343);
        Players b3 = new Players("Richarlison", 25, 81, 349);

        Players a1 = new Players("L. Messi", 35, 91, 356);
        Players a2 = new Players("A.D. Maria", 34, 84, 358);
        Players a3 = new Players("P. Dybala", 29, 86, 359);

        Players po1 = new Players("C. Ronaldo", 37, 90, 332);
        Players po2 = new Players("Pepe", 39, 81, 335);
        Players po3 = new Players("D. Costa", 23,79, 333);

        brazilPlayers.add(b1);
        brazilPlayers.add(b2);
        brazilPlayers.add(b3);

        argentinaPlayers.add(a1);
        argentinaPlayers.add(a2);
        argentinaPlayers.add(a3);

        portugalPlayers.add(po1);
        portugalPlayers.add(po2);
        portugalPlayers.add(po3);

        //Groups

        Groups g1 = new Groups("Group G", t1.getName());
        Groups g2 = new Groups("Group C", t2.getName());
        Groups g3 = new Groups("Group H", t3.getName());
        System.out.println(g1.getName()+"=>"+g1.getTeams());
        System.out.println(g2.getName()+"=>"+g2.getTeams());
        System.out.println(g3.getName()+"=>"+g3.getTeams());
    }
}