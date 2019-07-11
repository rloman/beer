package nl.youngcapital.beer.extra.model;

public class Fiets extends Vehicle {

    private int aantalTrappers;

    private boolean bel;

    public int getAantalTrappers() {
        return aantalTrappers;
    }

    public void setAantalTrappers(int aantalTrappers) {
        this.aantalTrappers = aantalTrappers;
    }

    public boolean isBel() {
        return bel;
    }

    public void setBel(boolean bel) {
        this.bel = bel;
    }

    @Override
    public void drive() {
        System.out.println("Driving fiets ...");
        this.setMileage(this.getMileage() + 2);
    }
}
