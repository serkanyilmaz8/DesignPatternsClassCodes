package strategy_gpt;

public class Beep implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("Beep beep");
    }
}
