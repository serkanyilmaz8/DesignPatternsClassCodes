package strategy_gpt;

public class Talk implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("Hello I can talk");
    }
}
