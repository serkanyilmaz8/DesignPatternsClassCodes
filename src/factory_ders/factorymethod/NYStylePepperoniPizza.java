package factory_ders.factorymethod;

public class NYStylePepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing NY Pepperoni Pizza");
    }
}
