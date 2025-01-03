package template_week10;

public class Coffee extends CaffeinBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar an Milk");
    }
}
