package factory_ders.simplefactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore() {
        this.factory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
