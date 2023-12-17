package example14;

import java.util.ArrayList;

public class TestSportTeam {

    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Player1");
        players.add("Player2");
        SportTeam sportTeam1 = new SportTeam("Team1", players);
        SportTeam sportTeam2 = null;
        try {
            sportTeam2 = sportTeam1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(sportTeam1);
        System.out.println(sportTeam2);
        System.out.println(sportTeam1 == sportTeam2);
        System.out.println(sportTeam1.equals(sportTeam2));
    }
}
