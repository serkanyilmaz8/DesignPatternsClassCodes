package facade_week9;

// DVDPlayer Class
public class DVDPlayer {
    Amplifier amplifier;

    public void on() {
        System.out.println("DVD Player is on");
    }

    public void off() {
        System.out.println("DVD Player is off");
    }

    public void eject() {
        System.out.println("DVD Player ejecting disc");
    }

    public void pause() {
        System.out.println("DVD Player paused");
    }

    public void play(String movie) {
        System.out.println("DVD Player playing \"" + movie + "\"");
    }

    public void setSurroundAudio() {
        System.out.println("DVD Player surround audio on");
    }

    public void setTwoChannelAudio() {
        System.out.println("DVD Player two-channel audio on");
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }
}
