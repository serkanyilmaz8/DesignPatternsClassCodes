package factory_ders.simplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese"))
            pizza = new CheesePizza();
        else if(type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else if(type.equals("greek"))
            pizza = new GreekPizza();

        return pizza;
    }
}
