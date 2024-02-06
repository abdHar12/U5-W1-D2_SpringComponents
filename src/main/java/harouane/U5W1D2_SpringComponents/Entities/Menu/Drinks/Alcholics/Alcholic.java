package harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks.Alcholics;

import harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks.Drink;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alcholic extends Drink {
    double grade;

    public Alcholic(String name, double calories, double price, double capacity, double grade) {
        super(name, calories, price, capacity);
        this.grade = grade;
    }


}
