package strategy_gpt;

public class Mute implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("<< Silence >>");
    }
}
