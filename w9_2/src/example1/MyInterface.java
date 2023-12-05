package example1;

interface MyInterface {
    // Static and final field
    int MAX_AGE = 100;

    // Abstract method
    void showAge();

    // Default method
    default void showMaxAge() {
        System.out.println("Maximum age is: " + MAX_AGE);
    }
}

