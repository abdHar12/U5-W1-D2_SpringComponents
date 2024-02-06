package harouane.U5W1D2_SpringComponents.Entities.Menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuItem {
    protected double calories;
    protected double price;
    protected String name;

    public MenuItem(String name, double calories, double price) {
        this.calories = calories;
        this.price = price;
        this.name = name;
    }


}


