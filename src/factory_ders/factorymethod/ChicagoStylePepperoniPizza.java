package factory_ders.factorymethod;

public class ChicagoStylePepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing Chicago Pepperoni Pizza");
    }
}
