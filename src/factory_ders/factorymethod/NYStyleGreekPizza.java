package factory_ders.factorymethod;

public class NYStyleGreekPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing NY Greek Pizza");
    }
}
