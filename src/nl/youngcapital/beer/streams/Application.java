package nl.youngcapital.beer.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Application {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233));

        Collections.shuffle(numbers);

        System.out.println(numbers);

        //primitive manier
        // alle even getallen printen
        for (int element : numbers) {
            if (element % 2 == 0) {
//                System.out.println(element);
            }
        }

        numbers.stream().filter(n -> n % 2 == 0).forEach(m -> {
            System.out.println(m);
        });

        numbers.stream().filter(n -> n % 2 != 0).forEach(n -> {
            System.out.println(n);
        });

        numbers.stream().filter(n -> n % 2 != 0).map(n -> n * n).forEach(n -> {
                    System.out.println("Oneven squared:" + n);
                }
        );

        numbers.stream().filter(n -> n % 2 != 0).sorted().distinct().forEach(n -> {
            System.out.println(n);
        });
    }
}


class MyYCPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}