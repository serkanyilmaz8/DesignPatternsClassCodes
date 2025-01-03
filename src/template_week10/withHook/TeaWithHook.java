package template_week10.withHook;

import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook{

    @Override
    public void brew() {
        System.out.println("Preparing coffee");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        System.out.println("Would you like lemon with your tea (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        return answer.toLowerCase().startsWith("y");

    }
}
