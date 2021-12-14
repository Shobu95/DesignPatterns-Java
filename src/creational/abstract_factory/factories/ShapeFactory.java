package creational.abstract_factory.factories;

import creational.abstract_factory.AbstractFactory;
import creational.abstract_factory.Shape;
import creational.abstract_factory.shapes.Rectangle;
import creational.abstract_factory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
