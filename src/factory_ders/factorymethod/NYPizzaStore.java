package factory_ders.factorymethod;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else if (type.equals("pepperoni"))
            pizza = new NYStylePepperoniPizza();
        else if (type.equals("greek"))
            pizza = new NYStyleGreekPizza();

        return pizza;
    }
}
