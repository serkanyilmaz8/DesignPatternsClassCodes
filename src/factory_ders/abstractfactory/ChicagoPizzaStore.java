package factory_ders.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore{
    public ChicagoPizzaStore() {
        factory = new ChicagoPizzaIngredientFactory();
    }

    public void scheduleDelivery(){
        //To do
    }
}
