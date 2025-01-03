package strategy_gpt;


public abstract class Robot {
    MoveBehavior moveBehavior;
    SoundBehavior soundBehavior;

    public Robot() { }

    public void performMove(){
        moveBehavior.move();
    }

    public void performSound(){
        soundBehavior.makeSound();
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    public abstract void display();
}
