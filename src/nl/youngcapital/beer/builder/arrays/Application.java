package nl.youngcapital.beer.builder.arrays;

public class Application {

    public static void main(String[] args) {
        int[] fibon = new int[3];
        fibon[2] = 1;

        Beer[] biertjes = new Beer[3];

        Beer jupiler = new Beer("Jupiler");

        biertjes[2] = jupiler;

        System.out.println(biertjes[2].getName());
    }
}


class Beer {

    String name;

    public Beer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
