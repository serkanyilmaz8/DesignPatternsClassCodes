package strategy_gpt;

public class Fly implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("Flying on the air");
    }
}
