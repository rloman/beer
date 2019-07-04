package nl.youngcapital.beer.builder.equality;

import nl.youngcapital.beer.builder.arraylist.Elpee;

public class Application2 {

    public static void main(String[] args) {

        Elpee elpee1 = new Elpee("The Joshua Tree");
        Elpee elpee2 = new Elpee("The Joshua Tree");

        System.out.println(elpee1 == elpee2);

        System.out.println(elpee1.equals(elpee2));

    }
}
