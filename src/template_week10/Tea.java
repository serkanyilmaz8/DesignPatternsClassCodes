package template_week10;

public class Tea extends CaffeinBeverage{

    @Override
    public void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
