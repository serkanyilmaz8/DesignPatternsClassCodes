package strategy_ders;

public class MallardDuck extends Duck{
    @Override
    void display() {
        System.out.println("I'm a real Mallard Duck");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
