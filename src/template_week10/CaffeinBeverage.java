package template_week10;

public abstract class CaffeinBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("Boiling Water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    // abstract methods
    public abstract void brew();
    public abstract  void addCondiments();
}
