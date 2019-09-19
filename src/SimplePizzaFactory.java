import pizza.Pizza;
import store.ChicagoStylePizzaStore;
import store.NyStylePizzaStore;
import store.PizzaStore;

public class SimplePizzaFactory {

    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese  ");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
