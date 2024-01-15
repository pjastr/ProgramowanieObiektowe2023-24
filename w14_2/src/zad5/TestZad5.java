package zad5;

import java.util.Arrays;
import java.util.HashSet;

public class TestZad5 {

    public static void main(String[] args) {
        Vehicle[] tab = new Vehicle[5];
        tab[0] = new Vehicle("AA", 34.5);
        tab[1] = new Vehicle("hh", 11.2);
        tab[2] = new Vehicle("ghg", 77.7);
        tab[3] = new Vehicle("44", 102.3);
        tab[4] = new Vehicle("ggfh", 34.5);
        for(var elem: tab){
            System.out.println(elem);
        }
        System.out.println(Algorithm.maxValue(tab));
        HashSet<Vehicle> set = new HashSet<>();
        set.add(new Vehicle("ee", 45.6));
        set.add(new Vehicle("hh", 34.9));
        System.out.println(Algorithm.maxValue2(set));
        System.out.println(Algorithm.maxValue2(Arrays.asList(tab)));
    }
}
