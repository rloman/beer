package nl.youngcapital.beer.builder.equality;

import nl.youngcapital.beer.builder.arraylist.Elpee;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Elpee> elpees = new ArrayList<>();

        elpees.add(new Elpee("The Joshua Tree"));
        elpees.add(new Elpee("The Joshua Tree"));
        elpees.add(new Elpee("The Joshua Tree"));
        elpees.add(new Elpee("The unforgettable fire"));


        System.out.println("De size is nu: " + elpees.size());

        elpees.remove(new Elpee("The Joshua Tree"));

//        while(elpees.contains(new Elpee("The Joshua Tree"))) {
//            elpees.remove(new Elpee("The Joshua Tree"));
//        }

        System.out.println("De size is nu: " + elpees.size());
    }
}
