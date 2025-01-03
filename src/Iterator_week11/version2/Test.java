package Iterator_week11.version2;

public class Test {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PanckeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}

