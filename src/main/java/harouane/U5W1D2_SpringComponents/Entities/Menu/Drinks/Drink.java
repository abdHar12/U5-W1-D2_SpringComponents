package harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks;

import harouane.U5W1D2_SpringComponents.Entities.Menu.MenuItem;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public abstract class Drink extends MenuItem {
    double capacity;

    public Drink(String name, double calories, double price, double capacity) {
        super(name, calories, price);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "-> Costo: " + price + ", Calorie: " + calories;
    }
}
