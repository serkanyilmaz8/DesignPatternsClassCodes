package Iterator_week11.version1;

public class MenuItem {
    private String name;
    private String description;
    private boolean vegeterian;
    private double price;

    public MenuItem(String name, String description, boolean vegeterian, double price) {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegeterian(){
        return vegeterian;
    }

    public double getPrice() {
        return price;
    }
}
