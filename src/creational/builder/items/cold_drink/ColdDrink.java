package creational.builder.items.cold_drink;

import creational.builder.items.Item;
import creational.builder.packing.Bottle;
import creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
