package Command_pattern;

public class CommandPatternTest {
    public static void main(String[] args) {
        Light kitchenLight = new Light();

        Command lightOn = new LightOnCommand(kitchenLight);
        Command lightOff = new LightOffCommand(kitchenLight);

        RemoteControl control1 = new RemoteControl();

        control1.setCommand(lightOn);
        control1.pressButton();
        control1.presButtonUndo();

        control1.setCommand(lightOff);
        control1.pressButton();
        control1.presButtonUndo();
    }

}
