package nl.youngcapital.beer.accessmods.accesssub;

import nl.youngcapital.beer.accessmods.Person;

public class Application {

    public static void main(String[] args) {


        Person p = new Person();
//        p.age want private

//        System.out.println(p.name); // want ik zit niet in hetzelfde package nu.

//        p.kleur nee want ik zit niet in hetzelfde package en ik (Application.java) ben geen kindje

        System.out.println(p.hand);

//        Girl g = new Girl();
    }
}
