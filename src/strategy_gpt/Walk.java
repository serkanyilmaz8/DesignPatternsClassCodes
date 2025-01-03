package strategy_gpt;

public class Walk implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("Walking on two legs");
    }
}
