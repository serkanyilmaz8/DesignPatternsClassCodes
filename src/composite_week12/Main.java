package composite_week12;

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "Bacon, lettuce, and tomato", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon, lettuce, and tomato", false, 2.99));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with flakey crust", true, 1.59));

        Waitress waitress = new Waitress(allMenus);

        System.out.println("\nFull Menu:");
        waitress.printMenu();

        System.out.println("\nVegetarian Menu:");
        waitress.printVegetarianMenu();
    }
}
