package example15;

public class TestTeam {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person[] team = new Person[3];
        team[0] = new Person("John", 20);
        team[1] = new Person("Mary", 21);
        team[2] = new Person("Peter", 22);
        Team t1 = new Team(team);
        System.out.println(t1);
        try {
            Team t2 = t1.clone();
            System.out.println(t2);
            System.out.println(t1==t2);
            System.out.println(t1.equals(t2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
