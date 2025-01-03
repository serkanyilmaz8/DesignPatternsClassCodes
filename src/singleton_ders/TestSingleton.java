package singleton_ders;

public class TestSingleton {
    public static void main(String[] args) {


        MyClass obj1 = MyClass.getInstance();
        obj1.foo();
        MyClass obj2 = MyClass.getInstance();
        MyClass obj3 = MyClass.getInstance();

        obj2.foo();
        obj3.foo();

        System.out.println("obj1.counter = " + obj1.counter);
        System.out.println("obj2.counter = " + obj2.counter);
        System.out.println("obj3.counter = " + obj3.counter);

        if(obj1 == obj2)
            System.out.println("same object");

    }
}
