package factory_ders.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing Chicago Cheese Pizza");
    }
}
