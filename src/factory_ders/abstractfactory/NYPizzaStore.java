package factory_ders.abstractfactory;

public class NYPizzaStore extends PizzaStore{
    public NYPizzaStore() {
        factory = new NYPizzaIngredientFactory();
    }

    public void scheduleDelivery(){
        //To do
    }
}
