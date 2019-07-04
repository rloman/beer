package nl.youngcapital.beer.builder;

public class Application {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append(3);

        builder.append(Math.sqrt(2));

        builder.append('R');

//        builder.reverse();


        // now to have the String (finally)


        String result = builder.toString();

        System.out.println(result);

        System.out.println(builder);

        String s = "";

        for (int i = 0; i < 100; i++) {
            s += Math.random()*100;
        }

        System.out.println(s);
    }
}
