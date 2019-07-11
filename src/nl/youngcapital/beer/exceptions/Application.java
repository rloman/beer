package nl.youngcapital.beer.exceptions;

public class Application {

    public static void main(String[] args) throws YoungCapitalException {
        int quotient = Mathematics.divide(6, 3);

        System.out.println(quotient);

        quotient = Mathematics.divide(4, 0);
        System.out.println(quotient);

        System.out.println("Einde programma ... ");
    }
}