package creational.abstract_factory.shapes;

import creational.abstract_factory.Shape;

public class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
