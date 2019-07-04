package nl.youngcapital.beer.arraylist;

public class Elpee {

    String name;

    int size;

    public Elpee() {

    }

    public Elpee(String name) {
        this.name = name;
        this.size = 0;
    }

    @Override
    public boolean equals(Object o) {
        Elpee elpee = (Elpee) o;

        return this.name.equals(elpee.name) && this.size == elpee.size;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
