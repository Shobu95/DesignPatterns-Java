package creational.abstract_factory.shapes;

import creational.abstract_factory.Shape;

public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
