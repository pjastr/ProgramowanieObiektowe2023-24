package example7;

class SportsCompetition implements Comparable<SportsCompetition> {
    private String name;
    private int year;

    public SportsCompetition(String name, int year) {
        this.name = name != null ? name : "";
        this.year = year;
    }

    @Override
    public int compareTo(SportsCompetition other) {
        int yearComparison = Integer.compare(this.year, other.year);
        if (yearComparison != 0) {
            return yearComparison;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + name + ",year=" + year;
    }
}
