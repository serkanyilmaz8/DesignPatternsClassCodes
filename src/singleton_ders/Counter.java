package singleton_ders;

public class Counter {
    int value = 0;

    public synchronized void increment(){
        value++;
    }
}
