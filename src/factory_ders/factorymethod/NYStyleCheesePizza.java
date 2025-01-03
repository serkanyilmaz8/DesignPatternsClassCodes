package factory_ders.factorymethod;

public class NYStyleCheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing NY Cheese Pizza");
    }
}
