package factory_ders.simplefactory;

public class PepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing Pepperoni Pizza");
    }
}
