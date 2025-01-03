package facade_week9;

// CDPlayer Class
public class CDPlayer {
    Amplifier amplifier;

    public void on() {
        System.out.println("CD Player is on");
    }

    public void off() {
        System.out.println("CD Player is off");
    }

    public void eject() {
        System.out.println("CD Player ejecting disc");
    }

    public void play(String album) {
        System.out.println("CD Player playing \"" + album + "\"");
    }

    public void stop() {
        System.out.println("CD Player stopped");
    }
}
