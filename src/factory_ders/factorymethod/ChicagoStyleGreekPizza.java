package factory_ders.factorymethod;

public class ChicagoStyleGreekPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing Chicago Greek Pizza");
    }
}
