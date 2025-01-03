package facade_week9;

// Tuner Class
public class Tuner {
    Amplifier amplifier;

    public void on() {
        System.out.println("Tuner is on");
    }

    public void off() {
        System.out.println("Tuner is off");
    }

    public void setAm() {
        System.out.println("Tuner setting AM mode");
    }

    public void setFm() {
        System.out.println("Tuner setting FM mode");
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner setting frequency to " + frequency);
    }
}