package factory_ders.simplefactory;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing Greek Pizza");
    }
}
