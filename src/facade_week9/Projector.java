package facade_week9;

// Projector Class
public class Projector {
    DVDPlayer dvdPlayer;

    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void tvMode() {
        System.out.println("Projector in TV mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector in widescreen mode");
    }

    public void setInput(DVDPlayer dvd) {
        System.out.println("DVD player setted");
    }

    public void setWideScreenMode() {
        System.out.println("Wide Screen Mode Setted");
    }
}
