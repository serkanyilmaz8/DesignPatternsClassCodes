package composite_week12;
import java.util.Iterator;

public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print(getName()+": "+getDescription()+", "+"$"+getPrice());
        if(isVegetarian())
            System.out.println(", (v)");

    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
