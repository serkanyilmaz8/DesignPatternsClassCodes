package template_week10.withHook;

public class BeverageTestDriveWithHook {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();

        System.out.println("\nMaking tea...");
        coffeeWithHook.prepareRecipe();
    }
}
