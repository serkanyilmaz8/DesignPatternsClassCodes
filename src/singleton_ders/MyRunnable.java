package singleton_ders;

public class MyRunnable implements Runnable{
    Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 50000; i++){
            counter.increment();
            //System.out.println(Thread.currentThread().getName() + " " + counter.value);
        }
        System.out.println("My Runnable finished");
        //System.out.println(Thread.currentThread().getName() + " " +counter.value);
    }
}
