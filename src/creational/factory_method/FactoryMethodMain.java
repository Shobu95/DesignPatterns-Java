package creational.factory_method;

public class FactoryMethodMain {
    public static void runMain() {
        VehicleFactory shapeFactory = new VehicleFactory();

        //get an object of Circle and call its draw method.
        Vehicle vehicle1 = shapeFactory.getVehicle("CAR");

        //call draw method of Circle
        vehicle1.showWheels();

        //get an object of Rectangle and call its draw method.
        Vehicle vehicle2 = shapeFactory.getVehicle("RICKSHAW");

        //call draw method of Rectangle
        vehicle2.showWheels();

        //get an object of Square and call its draw method.
        Vehicle vehicle3 = shapeFactory.getVehicle("BIKE");

        //call draw method of square
        vehicle3.showWheels();
    }
}
