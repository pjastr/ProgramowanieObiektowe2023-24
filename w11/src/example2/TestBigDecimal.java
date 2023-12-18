package example2;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestBigDecimal {

    public static void main(String[] args) {
        BigDecimal[] numbers = new BigDecimal[3];
        numbers[0] = new BigDecimal("1.0");
        numbers[2] = new BigDecimal("1.00");
        numbers[1] = new BigDecimal("1.000");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}