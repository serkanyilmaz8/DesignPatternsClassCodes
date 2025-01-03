package factory_ders.abstractfactory;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }
}
