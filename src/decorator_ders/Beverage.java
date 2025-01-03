package decorator_ders;

public abstract class Beverage {
    String description = "Unknown Descripiton";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
