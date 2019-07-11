package nl.youngcapital.beer.accessmods;

public class Application {


    public static void main(String[] args) {
        Person p = new Person();

//        System.out.println(p.age); // vout want age is private

        System.out.println(p.name);

        System.out.println(p.kleur); // kan want ik zit nu in hetzelfde package dus JA
        System.out.println(p.hand);

    }
}
