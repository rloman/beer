package nl.youngcapital.beer.enhancedfor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    String element = null;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Januari", "Februari", "Maart"));

        for (String element : names) {
            System.out.println(element);
        }

        for (String element : names) {
            System.out.println(element);
        }

        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        for(int element: numbers) {
            System.out.println(element);
        }
    }
}
