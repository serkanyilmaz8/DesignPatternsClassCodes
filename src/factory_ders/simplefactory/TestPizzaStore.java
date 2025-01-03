package factory_ders.simplefactory;

public class TestPizzaStore {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        Pizza pizza = store.orderPizza("pepperoni");
        pizza = store.orderPizza("greek");
    }
}
