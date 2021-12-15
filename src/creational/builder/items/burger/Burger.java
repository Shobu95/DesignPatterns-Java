package creational.builder.items.burger;

import creational.builder.items.Item;
import creational.builder.packing.Packing;
import creational.builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
