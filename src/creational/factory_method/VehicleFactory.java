package creational.factory_method;

import creational.factory_method.vehicles.Car;
import creational.factory_method.vehicles.Rickshaw;
import creational.factory_method.vehicles.Bike;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();

        } else if (vehicleType.equalsIgnoreCase("RICKSHAW")) {
            return new Rickshaw();

        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }

        return null;
    }
}
