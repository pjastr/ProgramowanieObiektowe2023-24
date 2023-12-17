package example17;

public class TestPair {

    public static void main(String[] args) {
        Pair<String> p = new Pair<>("Jan", "Kowalski");
        System.out.println(p.getFirst() + " " + p.getSecond());
        p.setFirst("Adam");
        p.setSecond("Nowak");
        System.out.println(p.getFirst() + " " + p.getSecond());
        String[] words = {"Ala", "ma", "kota", "i", "psa"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
