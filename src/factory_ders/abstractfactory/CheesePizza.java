package factory_ders.abstractfactory;

public class CheesePizza extends Pizza{
    public CheesePizza(PizzaIngredientFactory factory) {
        super(factory);
    }

    public void prepare(){
        super.prepare();
        this.cheese = factory.createCheese();
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
        System.out.println(cheese.getClass().getName());
        System.out.println(dough.getClass().getName());
        System.out.println(sauce.getClass().getName());
        System.out.println("Preparing Cheese Pizza");
    }
}
