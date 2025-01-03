package factory_ders.abstractfactory;

public class TestPizzaStore {

    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        Pizza pizza = nystore.orderPizza("cheese");
        pizza = nystore.orderPizza("pepperoni");

        PizzaStore chstore = new ChicagoPizzaStore();
        pizza = chstore.orderPizza("cheese");
        pizza = chstore.orderPizza("pepperoni");
    }
}
