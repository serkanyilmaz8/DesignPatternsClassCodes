package adapter_week8;

public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("<------------------------------------------------->");

        System.out.println("The Mallard Duck says...");
        testDuck(mallardDuck);

        System.out.println("<------------------------------------------------->");

        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }


    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
