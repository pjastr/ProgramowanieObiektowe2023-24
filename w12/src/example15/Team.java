package example15;

import java.util.Arrays;

public class Team implements Cloneable{

    private Person[] team;

    public Team(Person[] team) throws CloneNotSupportedException {
        //this.team = team!=null ? team.clone() : new Person[0]; //wrong
        this.team = new Person[team.length];
        for (int i = 0; i < team.length; i++) {
            this.team[i] = team[i].clone();
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": team=" + Arrays.toString(team);
    }

    @Override
    public Team clone() throws CloneNotSupportedException {
        Team t = (Team) super.clone();
        // t.team = team.clone(); // this is wrong
        t.team = new Person[team.length];
        for (int i = 0; i < team.length; i++) {
            t.team[i] = team[i].clone();
        }

        return t;
    }
}
