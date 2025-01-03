package singleton_ders;

public class MultithreadExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread = new Thread(new MyRunnable(counter));
        thread.start();

        for(int i = 0; i < 50000; i++){
            counter.increment();
            //System.out.println(Thread.currentThread().getName() + " " + counter.value);
        }

        thread.join();
        System.out.println(Thread.currentThread().getName() + " " + counter.value);
    }
}
