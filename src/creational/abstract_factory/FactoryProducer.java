package creational.abstract_factory;

import creational.abstract_factory.factories.RoundedShapeFactory;
import creational.abstract_factory.factories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
