package example23;

public class Test23 {

    public static void main(String[] args) {

        Pair<Animal> animals = new Pair<>(new Animal(), new Animal());
        printAnimals(animals);
        Pair<Dog> dogs = new Pair<>(new Dog(), new Dog());
        //printAnimals(dogs);
        printAnimalsFix(animals);
        printAnimalsFix(dogs);
        printAnimalsFix2(animals);
        printAnimalsFix2(dogs);
        printAnimalsFix3(animals);
        printAnimalsFix3(dogs);

    }

    public static void printAnimals(Pair<Animal> animals) {
        System.out.println(animals.getFirst().toString() + " " + animals.getSecond().toString());
    }

    public static void printAnimalsFix(Pair<? extends Animal> animals) {
        System.out.println(animals.getFirst().toString() + " " + animals.getSecond().toString());
    }

    public static void printAnimalsFix2(Pair<? super Dog> animals) {
        System.out.println(animals.getFirst().toString() + " " + animals.getSecond().toString());
    }

    public static void printAnimalsFix3(Pair<?> animals) {
        System.out.println(animals.getFirst().toString() + " " + animals.getSecond().toString());
    }
}
