package harouane.U5W1D2_SpringComponents.Entities.Menu;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Pizza extends MenuItem {

    List<Topping> toppings;

    public Pizza(String name, double calories, double price, List<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    void addToppings(List<Topping> toppings) {
        toppings.forEach(t -> this.toppings.add(t));
    }

    @Override
    public String toString() {
        return "\n" + name + ": " + toppings + "\n-> Costo: " + price + ", Calorie: " + calories;
    }


}
