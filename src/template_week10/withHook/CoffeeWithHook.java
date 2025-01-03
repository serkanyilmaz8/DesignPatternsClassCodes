package template_week10.withHook;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        System.out.println("Would you like milk and sugar with your coffee(y/n): ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.toLowerCase().startsWith("y");
    }
}
