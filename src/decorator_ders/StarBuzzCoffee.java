package decorator_ders;

public class StarBuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso(); // espresso order, no condiments
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(); // get a DarkRoast
        beverage2 = new Mocha(beverage2); // wrap it with Mocha
        beverage2 = new Mocha(beverage2); // warp it with Mocha
        beverage2 = new Whip(beverage2); // Wrap it with a Whip
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(); // get a Houseblend
        beverage3 = new Soy(beverage3); // wrap with Soy
        beverage3 = new Mocha(beverage3); // wrap with Mocha
        beverage3 = new Whip(beverage3); // wrap with Whip
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
