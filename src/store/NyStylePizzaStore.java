package store;

import pizza.Pizza;
import pizzany.NyStyleCheesePizza;
import pizzany.NyStyleClamPizza;
import pizzany.NyStylePepperoniPizza;
import pizzany.NyStyleVeggiePizza;

public class NyStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new NyStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NyStylePepperoniPizza();
                break;
            case "clam":
                pizza = new NyStyleClamPizza();
                break;
            case "veggie":
                pizza = new NyStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}
