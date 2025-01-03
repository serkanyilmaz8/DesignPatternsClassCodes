package factory_ders.factorymethod;

public class ChicagoPizzaStore extends PizzaStore{

    public void scheduleDelivery(){

    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        else if(type.equals("pepperoni"))
            pizza = new ChicagoStylePepperoniPizza();
        else  if (type.equals("greek"))
            pizza = new ChicagoStyleGreekPizza();

        return pizza;
    }
}
