package rekordy;

record Person(String name, int age) {

    // Niestandardowy konstruktor
    public Person {
        if (name == null || name.isBlank()) {
            System.out.println("Uwaga: Podano puste imię.");
            name = "Nieznane";
        }
        if (age < 0) {
            System.out.println("Uwaga: Podano ujemny wiek. Ustawiamy na 0.");
            age = 0;
        }
    }
}
