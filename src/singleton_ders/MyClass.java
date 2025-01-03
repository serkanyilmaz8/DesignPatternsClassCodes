package singleton_ders;

public class MyClass {
    int counter = 0;

    private static MyClass instance = new MyClass();

    private MyClass(){
        System.out.println("Creating an instance from MyClass");
    }

    public void foo(){
        System.out.println("foo is called");
        counter++;
    }

    public static  MyClass getInstance(){
        if (instance == null)
            synchronized (MyClass.getInstance()) {
                if (instance == null) {
                    instance = new MyClass();
                }
            }
        return instance;
    }
}
