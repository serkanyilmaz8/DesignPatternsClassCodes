package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        currentDisplay.display();

        weatherData.setMeasurements(20, 45, 666);
        currentDisplay.display();
    }
}
