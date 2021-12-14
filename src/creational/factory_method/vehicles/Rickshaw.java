package creational.factory_method.vehicles;

import creational.factory_method.Vehicle;

public class Rickshaw implements Vehicle {
    @Override
    public void showWheels() {
        System.out.println("I have 3 wheels");
    }
}
