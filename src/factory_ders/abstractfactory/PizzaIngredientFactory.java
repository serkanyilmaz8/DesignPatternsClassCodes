package factory_ders.abstractfactory;

public abstract class PizzaIngredientFactory {
    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();

}
