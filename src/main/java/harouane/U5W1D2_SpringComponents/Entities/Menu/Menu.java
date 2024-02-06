package harouane.U5W1D2_SpringComponents.Entities.Menu;

import harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks.Drink;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    List<Pizza> pizzas;
    List<Drink> drinks;
    List<Topping> toppings;

    public void print() {
        System.out.println("-------------------------MENU-------------------------\n" +
                "---PIZZE-------------------------\n");
        this.pizzas.forEach(System.out::println);
        System.out.println("---Topping per pizze personalizzate-------------------------\n");
        this.toppings.forEach(System.out::println);
        System.out.println("---Bevande-------------------------\n");
        this.drinks.forEach(System.out::println);
    }
}
