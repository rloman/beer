package nl.youngcapital.beer.accessmods.accesssub;

import nl.youngcapital.beer.accessmods.Person;

public class Female extends Person {


    public void foo() {

        System.out.println(this.kleur);

    }

    public void bar() {
        Person p = new Person();
//        System.out.println(p.kleur); // kan niet want dit is niet MIJN VADER maar een andere vader ...
    }

}
