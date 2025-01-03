package decorator_gpt;

// Concrete Component - Temel Kahve Sınıfı

public class SimpleCoffee implements Coffee{
    @Override
    public String getDEscription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
