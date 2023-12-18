package example7;

class Olympics extends SportsCompetition implements Comparable<SportsCompetition>{
    private String hostCity;

    public Olympics(String name, int year, String hostCity) {
        super(name, year);
        this.hostCity = hostCity != null ? hostCity : "";
    }

    @Override
    public int compareTo(SportsCompetition other) {
        if (other instanceof Olympics) {
            Olympics otherOlympics = (Olympics) other;
            int baseComparison = super.compareTo(otherOlympics);
            if (baseComparison != 0) {
                return baseComparison;
            }
            return this.hostCity.compareTo(otherOlympics.hostCity);
        }
        return super.compareTo(other);
    }

    @Override
    public String toString() {
        return super.toString() + ", hostCity=" + hostCity;
    }
}
