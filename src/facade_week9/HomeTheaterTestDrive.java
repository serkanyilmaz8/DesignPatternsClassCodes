package facade_week9;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // Alt sistem bileşenlerini oluştur
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvd = new DVDPlayer();
        CDPlayer cd = new CDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        // Facade sınıfını oluştur
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        // Film izleme ve bitirme işlemleri
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}

