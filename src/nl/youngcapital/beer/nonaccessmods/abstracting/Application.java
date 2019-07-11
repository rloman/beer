package nl.youngcapital.beer.nonaccessmods.abstracting;

public class Application {

    public static void main(String[] args) {

        Person p;
        p = new Female();

        p.drink();

        p = new Male();
        p.drink();

    }
}


abstract class Person {

    public abstract void drink();

}


class Female extends Person {

    @Override
    public void drink() {

        System.out.println("Drinking wine ...");

    }
}

class Male extends Person {

    @Override
    public void drink() {

        System.out.println("Drinking beer ... ");

    }
}


