package example3;

public class Manager extends Employee implements Comparable<Employee>{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) + ", bonus=" + bonus + ".";
    }

    @Override
    public int compareTo(Employee other) {
        if (other.getClass() != Manager.class) {
            throw new ClassCastException("Nie można porównać Managera z innym typem Employee");
        }
        Manager otherManager = (Manager) other;

        int baseComparison = super.compareTo(otherManager);
        if (baseComparison != 0) {
            return baseComparison;
        }

        // Porównanie na podstawie bonusu
        return Integer.compare(this.bonus, otherManager.bonus);
    }
}