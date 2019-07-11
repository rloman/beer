package nl.youngcapital.beer.extra.model;

public class Vehicle {

    private int mileage;

    public void drive() {
        System.out.println("Driving vehicle ...");
        this.mileage++;
    }

    public int getMileage() {
        return this.mileage;
    }

    protected void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
