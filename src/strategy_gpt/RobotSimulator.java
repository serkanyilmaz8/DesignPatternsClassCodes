package strategy_gpt;

public class RobotSimulator {
    public static void main(String[] args) {
        Robot domesticRobot = new DomesticRobot();
        domesticRobot.display();
        domesticRobot.performMove();
        domesticRobot.setMoveBehavior(new Walk());
        domesticRobot.performMove();
        domesticRobot.performSound();

        System.out.println("----------------------------------");

        Robot industrialRobot = new IndustrialRobot();
        industrialRobot.display();
        industrialRobot.performMove();
        industrialRobot.performSound();
    }
}
