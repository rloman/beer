package nl.youngcapital.beer.extra;

import nl.youngcapital.beer.extra.model.Fiets;
import nl.youngcapital.beer.extra.model.LigFiets;
import nl.youngcapital.beer.extra.model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.drive();
        vehicle.drive();
        vehicle.drive();

        System.out.println(vehicle.getMileage());

        Vehicle v = new LigFiets();

        System.out.println(v.getMileage());

        Vehicle ligFiets = new LigFiets();

        ligFiets.drive();
        System.out.println(ligFiets.getMileage());

        List<Vehicle> vehicles = new LinkedList<>();
        vehicles.addAll(Arrays.asList(vehicle, v, ligFiets));

        System.out.println("Begin van de tester => ");

        VehicleTester vehicleTester = new VehicleTester();
        vehicleTester.testAllVehicles(vehicles);

        System.out.println("Einde van de tester => ");
    }
}

class VehicleTester {

    public void testAllVehicles(List<Vehicle> vehicles) {

        for(Vehicle v: vehicles) {
            v.drive();
        }
    }
}
