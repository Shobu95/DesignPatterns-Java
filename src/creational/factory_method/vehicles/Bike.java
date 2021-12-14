package creational.factory_method.vehicles;

import creational.factory_method.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void showWheels() {
        System.out.println("I have 2 wheels");
    }
}
