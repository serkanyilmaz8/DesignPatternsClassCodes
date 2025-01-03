package factory_ders.factorymethod;

public class TestPizzaStore {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        pizza = nyStore.orderPizza("greek");

        PizzaStore chStore = new ChicagoPizzaStore();
        pizza = chStore.orderPizza("pepperoni");
        pizza = chStore.orderPizza("cheese");
    }
}
