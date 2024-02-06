package harouane.U5W1D2_SpringComponents.Entities.Menu;

public class Topping extends MenuItem {
    public Topping(String name, double calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return name + " -> " + "Prezzo: " + price + ", Calorie: " + calories;
    }
}
