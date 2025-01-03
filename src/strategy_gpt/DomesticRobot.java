package strategy_gpt;

public class DomesticRobot extends Robot{
    public DomesticRobot() {
        moveBehavior = new MoveOnWheels();
        soundBehavior = new Beep();
    }

    @Override
    public void display() {
        System.out.println("I'm a domestic robot");
    }
}
