package example16;

import static example16.FactorialCalculator.factorial;

public class TestFactorialCalculator {

    public static void main(String[] args) {
        try {
            System.out.println("Silnia 5: " + factorial(5));
            System.out.println("Silnia -1: " + factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}
