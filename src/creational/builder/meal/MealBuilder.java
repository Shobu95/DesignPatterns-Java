package creational.builder.meal;

import creational.builder.items.burger.ChickenBurger;
import creational.builder.items.cold_drink.Coke;
import creational.builder.items.cold_drink.Pepsi;
import creational.builder.items.burger.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
