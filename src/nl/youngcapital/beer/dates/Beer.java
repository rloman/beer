package nl.youngcapital.beer.dates;

import java.time.LocalDate;

public class Beer {

    String name;

    LocalDate drinkDate;

    public Beer() {
        this.drinkDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDrinkDate() {
        return drinkDate;
    }

}
