package decorator_gpt;

public class Main {
    public static void main(String[] args) {

        // Simple Coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDEscription() + " $ " + myCoffee.getCost() );

        // Sütlü Kahve
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDEscription() + " $ " + myCoffee.getCost() );

        //Şekerli Kahve
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDEscription() + " $ " + myCoffee.getCost() );
    }
}
