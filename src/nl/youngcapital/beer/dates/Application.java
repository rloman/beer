package nl.youngcapital.beer.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Application {

    public static void main(String[] args) {
        // gebruik geen java.util.Date als je dat kunt, want die is crappy!

        // Desire: I want a date when I drank a beer



        /*


        // Story =>
        AS a Beerdrinker
        I WANT to know when I drank a Beer (date)
        SO THAT I can record later for myself when I am 80 on which Date I drank my first Grolsch (e.g.)


        // Acceptance-criteria:
        Given: I have a Beer class

        When: I create an instance of the class Beer

        Then: the Date (now) should be set als field: drinkDate

         */

        Beer beer = new Beer();

        System.out.println(beer.getDrinkDate());

        LocalDate nu = LocalDate.now();

        System.out.println(nu);

        // nieuwe
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // ik wil drie maand en 2 dagen en 1 uur terug
        LocalDateTime terugIndeTijd = now.minusMonths(3).minusDays(2).minusHours(1);

        System.out.println("Dat is: " + terugIndeTijd);

        LocalDateTime myBirthMoment = LocalDateTime.of(1968, 8, 9, 15, 30, 00);

        Period periode = Period.between(myBirthMoment.toLocalDate(), now.toLocalDate());

        System.out.println(periode);


        System.out.println("meneer Loman is nu: "+periode.getYears()+" jaren en "+periode.getMonths()+" maanden!");


        //ChronoUnit ...
        long aantalseconden = ChronoUnit.SECONDS.between(myBirthMoment, now);

        System.out.println(aantalseconden);

    }
}
