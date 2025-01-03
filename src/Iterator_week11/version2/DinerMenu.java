package Iterator_week11.version2;
import Iterator_week11.version1.MenuItem;
import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Bacon, lettuce, and tomato", true, 2.99);
        addItem("BLT", "Bacon, lettuce, and tomato", false, 2.99);
        addItem("Soup of the day", "Soup with side of potato salad", false, 3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        if(numberOfItems>MAX_ITEMS)
            System.out.println("Sorry, menu is full! Can't ad item.");
        else{
            menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
            numberOfItems++;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
