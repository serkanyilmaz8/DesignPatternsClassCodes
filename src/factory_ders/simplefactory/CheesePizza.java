package factory_ders.simplefactory;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing Cheese Pizza");
    }
}
