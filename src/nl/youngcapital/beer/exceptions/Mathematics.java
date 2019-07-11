package nl.youngcapital.beer.exceptions;

public class Mathematics {

    public static int divide(int teller, int noemer) throws YoungCapitalException  {

        if(noemer != 0) {
            return teller/noemer;
        }
        else {
            // chips
            throw new YoungCapitalException();
        }

    }


}
