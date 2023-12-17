package example14;

import java.util.ArrayList;

public class SportTeam implements Cloneable{

    private String name;
    private ArrayList<String> players;

    public SportTeam(String name, ArrayList<String> players) {
        this.name = name;
        this.players = players != null ? new ArrayList<>(players) : new ArrayList<>();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + name + ", players=" + players;
    }

    @Override
    public SportTeam clone() throws CloneNotSupportedException {
        SportTeam sportTeam = (SportTeam) super.clone();
        sportTeam.players = new ArrayList<>(players);
        return sportTeam;
    }

}
