package factory_ders.abstractfactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Sipariş edilen: " + pizza.getClass().toString() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Sipariş edilen: " + pizza.getClass().toString()+ "\n");
    }
}