package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidty;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current Conditions: "+temperature+"F degrees, "+humidty+"% humidty");
    }

    @Override
    public void update(float temp, float hum, float press) {
        this.temperature = temp;
        this.humidty = hum;
        display();
    }
}
