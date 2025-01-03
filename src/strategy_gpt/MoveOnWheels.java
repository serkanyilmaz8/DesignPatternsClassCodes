package strategy_gpt;

public class MoveOnWheels implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("Moving on wheels!");
    }
}
