package adapter_week8;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

