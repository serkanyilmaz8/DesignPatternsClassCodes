package decorator_ders;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "Home Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
