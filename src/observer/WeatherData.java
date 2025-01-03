package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0)
            observers.remove(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i< observers.size(); i++){
            Observer o = (Observer) observers.get(i);
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float hum, float press){
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        measurementChanged();
    }
}
