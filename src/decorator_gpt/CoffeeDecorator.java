package decorator_gpt;

public class CoffeeDecorator implements Coffee{
    protected  Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratedCoffee = decoratorCoffee;
    }

    @Override
    public String getDEscription() {
        return decoratedCoffee.getDEscription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
