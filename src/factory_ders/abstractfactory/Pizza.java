package factory_ders.abstractfactory;

public class Pizza {
    Cheese cheese;
    Dough dough;
    Sauce sauce;
    PizzaIngredientFactory factory;

    public Pizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public void prepare() {
        System.out.println("Preparing Dough");
    }

    public void bake() {
        System.out.println("Baking Pizza");
    }

    public void cut() {
        System.out.println("Cutting Pizza");
    }

    public void box() {
        System.out.println("Boxing Pizza");
    }
}
