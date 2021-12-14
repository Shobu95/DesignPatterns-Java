package creational.abstract_factory.shapes;

import creational.abstract_factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
