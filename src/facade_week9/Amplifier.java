package facade_week9;

// Amplifier Class
public class Amplifier {
    Tuner tuner;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }

    public void setCd(CDPlayer cd) {
        this.cdPlayer = cd;
        System.out.println("Amplifier setting CD player");
    }

    public void setDvd(DVDPlayer dvd) {
        this.dvdPlayer = dvd;
        System.out.println("Amplifier setting DVD player");
    }

    public void setStereoSound() {
        System.out.println("Amplifier stereo sound on");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Amplifier setting tuner");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier setting volume to " + level);
    }

    public void setDVD(DVDPlayer dvd) {
        System.out.println("Setted DVD");
    }
}