package Iterator_week11.version1;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
