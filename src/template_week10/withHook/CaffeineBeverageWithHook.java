package template_week10.withHook;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        // Hook metodu çağrılıyor
        if(customerWantsCondiments())
            addCondiment();

    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring in cup");
    }

    public abstract void brew();
    public abstract void addCondiment();

    // Hook metodu: Varsayılan olarak true döner
    public boolean customerWantsCondiments(){
        return true;
    }
}
