package decoratorpattern.java.pizza;

import java.util.Scanner;

import decoratorpattern.java.pizza.BasePizza.BasePizza;
import decoratorpattern.java.pizza.BasePizza.FarmHouse;
import decoratorpattern.java.pizza.BasePizza.Margharita;
import decoratorpattern.java.pizza.Toppings.ExtraCheeseDecorator;
import decoratorpattern.java.pizza.Toppings.MushroomDecorator;

public class PizzaMain {
    private static final BasePizza NULL = null;

    public static void main(String[] args) {
        System.out.println("Please select the Pizza :- ");
        System.out.println("type 1 for base pizza, 2 for farmhouse and 3 for margharita pizza");
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        BasePizza basePizza;

        switch (n) {
            case 2:
                basePizza = new FarmHouse();
                break;
            case 3:
                basePizza = new Margharita();
                break;
            default:
                basePizza = new BasePizza() {

                    @Override
                    public int cost() {
                        return 50;
                    }
                };
                break;
        }

        if (basePizza != NULL) {
            boolean isExit = false;
            do {

                System.out.println("Please add topping if u want :- ");
                System.out.println("1 for yes ");
                System.out.println("0 for exit");

                n = scn.nextInt();

                if (n == 1) {
                    System.out.println("1 for extra-chesse ");
                    System.out.println("2 for mushroom");
                    n = scn.nextInt();

                    switch (n) {
                        case 1:
                            basePizza = new ExtraCheeseDecorator(basePizza);
                            break;
                        case 2:
                            basePizza = new MushroomDecorator(basePizza);
                            break;
                        default:
                            break;
                    }
                } else {
                    isExit = true;
                    System.out.println("Pizza total cost is " + basePizza.cost());
                }
            } while (!isExit);
        }

        scn.close();

    }
}
