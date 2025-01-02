package decoratorpattern.java.pizza.Toppings;

import decoratorpattern.java.pizza.BasePizza.BasePizza;

public class ExtraCheeseDecorator extends ToppingDecorator {
    public BasePizza pizza;

    public ExtraCheeseDecorator(BasePizza basePizza) {
        this.pizza = basePizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }

}
