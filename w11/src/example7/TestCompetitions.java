package example7;

import java.util.ArrayList;
import java.util.Collections;

public class TestCompetitions {

    public static void main(String[] args) {
        ArrayList<SportsCompetition> competitions = new ArrayList<>();
        competitions.add(new SportsCompetition("World Cup", 2014));
        competitions.add(new Olympics("Summer Olympics", 2016, "Rio de Janeiro"));
        competitions.add(new Olympics("Winter Olympics", 2018, "Pyeongchang"));
        competitions.add(new SportsCompetition("World Cup", 2018));
        competitions.add(new Olympics("Summer Olympics", 2020, "Tokyo"));
        competitions.add(new SportsCompetition("World Cup 2018", 2018));
        System.out.println("Before sorting:");
        for (var competition : competitions) {
            System.out.println(competition);
        }
        competitions.sort(null);
        System.out.println("\nAfter sorting:");
        for (var competition : competitions) {
            System.out.println(competition);
        }

    }
}
