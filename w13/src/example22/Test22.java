package example22;

public class Test22 {

    public static void main(String[] args) {
        //Pair<Animal> obj = new Pair<Dog>(); // to nie jest możliwe
        var obj2 = new Pair<Dog>();
        // reszta kodu nie jest zalecana
        Pair obj3 = obj2;
        obj3.setFirst(new Dog());
        obj3.setSecond(new Animal());
    }
}
