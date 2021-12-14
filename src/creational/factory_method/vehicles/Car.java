package creational.factory_method.vehicles;

import creational.factory_method.Vehicle;

public class Car implements Vehicle {
    @Override
    public void showWheels() {
        System.out.println("I have 4 wheels");
    }
}
