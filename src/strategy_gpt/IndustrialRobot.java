package strategy_gpt;

public class IndustrialRobot extends Robot{
    public IndustrialRobot() {
        moveBehavior = new Walk();
        soundBehavior = new Talk();
    }

    @Override
    public void display() {
        System.out.println("I'm a industrial robot");
    }
}
