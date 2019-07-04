package nl.youngcapital.beer.builder.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Application {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(3);
        numbers.add(5);
        numbers.add(88);

        numbers.add(1, 4);

        // basic loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        // handige manier // enhanced for loop
        for (int element : numbers) {
            System.out.println(element);
        }


        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // vraag: hoe print ik met comma

        if (numbers.size() > 0) {
            System.out.print(numbers.get(0));
        }
        if (numbers.size() > 1) {
            for (int i = 1; i < numbers.size(); i++) {
                System.out.print(", " + numbers.get(i));
            }
        }
        System.out.println();

//        String label = String.join(", ", numbers);


        numbers.remove(0); // index

        System.out.println(numbers);

        ArrayList<Elpee> elpees = new ArrayList<>();

        Elpee victim = new Elpee();

        elpees.add(new Elpee());
        elpees.add(victim);
        elpees.add(new Elpee());

        System.out.println("De size is nu: " + elpees.size());

        elpees.remove(victim);

        ArrayList<Integer> fibon = new ArrayList<>();

        fibon.addAll(Arrays.asList(0,1,1,2,3,5,13,21));

        System.out.println(fibon);


    }
}
