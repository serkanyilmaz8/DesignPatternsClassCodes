package factory_ders.abstractfactory;

public  class PizzaStore {
    PizzaIngredientFactory factory;

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese"))
            pizza = new CheesePizza(factory);
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza(factory);
        return pizza;
    }

}
