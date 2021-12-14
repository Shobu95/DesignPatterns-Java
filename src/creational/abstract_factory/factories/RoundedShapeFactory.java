package creational.abstract_factory.factories;

import creational.abstract_factory.AbstractFactory;
import creational.abstract_factory.Shape;
import creational.abstract_factory.shapes.RoundedRectangle;
import creational.abstract_factory.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
