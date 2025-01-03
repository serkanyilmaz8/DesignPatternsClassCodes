package state_week13;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("\nInitial State:");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("\nInsert another quarter:");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("\nEject quarter:");
        gumballMachine.ejectQuarter();

        System.out.println("\nTurn crank without quarter:");
        gumballMachine.turnCrank();

        System.out.println("\nDispense when sold out:");
        for (int i = 0; i < 5; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }
}
