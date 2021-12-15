package creational.builder.items.burger;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
