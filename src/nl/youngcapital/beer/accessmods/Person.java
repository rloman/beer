package nl.youngcapital.beer.accessmods;

public class Person {


    private int age; // private
    String name; // default === package
    protected String kleur; // protected = package + kids
    public String hand; // the world


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
