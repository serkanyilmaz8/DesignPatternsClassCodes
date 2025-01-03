package Iterator_week11.version1;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "BAcon, lettuce, and tomato", true, 2.99);
        addItem("BLT", "baco, lettuce, and tomato", false, 2.99);
        addItem("Soup of the day", "Soup with side of patato salad", false, 3.29);

    }

    public void addItem(String name, String description, boolean vegeterian, double price){
        if(numberOfItems > MAX_ITEMS) {
            System.out.println("Sorry, Menu is full! You cannot add item.");
        }else {
            menuItems[numberOfItems] = new MenuItem(name, description, vegeterian, price);
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
