package template_week10;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CaffeinBeverage tea = new Tea();
        CaffeinBeverage coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee");
        coffee.prepareRecipe();
    }
}
