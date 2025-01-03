package facade_week9;

// TheaterLights Class
public class TheaterLights {
    public void on() {
        System.out.println("Theater Lights are on");
    }

    public void off() {
        System.out.println("Theater Lights are off");
    }

    public void dim(int level) {
        System.out.println("Theater Lights dimming to " + level + "%");
    }
}
