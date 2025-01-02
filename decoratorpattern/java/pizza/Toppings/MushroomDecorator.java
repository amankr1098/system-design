package decoratorpattern.java.pizza.Toppings;

import decoratorpattern.java.pizza.BasePizza.BasePizza;

public class MushroomDecorator extends ToppingDecorator {
    public BasePizza basePizza;

    public MushroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
