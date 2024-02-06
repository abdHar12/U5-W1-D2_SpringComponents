package harouane.U5W1D2_SpringComponents.BeansConfigs;

import harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks.Alcholics.Alcholic;
import harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks.Drink;
import harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks.NonAlcholic.AlcholicFree;
import harouane.U5W1D2_SpringComponents.Entities.Menu.Menu;
import harouane.U5W1D2_SpringComponents.Entities.Menu.Pizza;
import harouane.U5W1D2_SpringComponents.Entities.Menu.Topping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {
    @Bean
    Pizza pizzaMargherita() {
        return new Pizza("Pizza Margherita", 1104, 4.99, new ArrayList<>(Arrays.asList(tomato(), cheese())));
    }

    @Bean
    Pizza hawaiianPizza() {
        return new Pizza("Hawaiian Pizza", 1024, 6.49, new ArrayList<>(Arrays.asList(tomato(), cheese(), pineapple(), ham())));
    }

    @Bean
    Pizza salamiPizza() {
        return new Pizza("Salami Pizza", 1160, 5.99, new ArrayList<>(Arrays.asList(tomato(), cheese(), salami())));
    }

    @Bean(name = "personalizedPizza")
    Pizza personalizedPizza() {
        return pizzaMargherita();
        /*
        double calories = pizzaMargherita().getCalories() + toppings.stream().mapToDouble(MenuItem::getCalories).sum();
        double price = pizzaMargherita().getPrice() + toppings.stream().mapToDouble(MenuItem::getCalories).sum();
        return new Pizza("Pizza a scelta", calories, price, toppings);*/
    }

    @Bean
    Alcholic wine() {
        return new Alcholic("Wine", 607, 7.49, 0.75, 13);
    }

    @Bean
    AlcholicFree lemonade() {
        return new AlcholicFree("Lemonade", 128, 1.29, 0.33);
    }

    @Bean
    AlcholicFree water() {
        return new AlcholicFree("Water", 0, 1.29, 0.5);
    }

    @Bean
    Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    Topping extraCheese() {
        return new Topping("Extra Cheese", 92, 0.69);
    }

    @Bean
    Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    Topping tomato() {
        return new Topping("Tomato", 0, 0);
    }

    @Bean
    Topping cheese() {
        return new Topping("Cheese", 0, 0);
    }

    @Bean
    double getPriceOfSeat(@Value("${restaurant.priceSeat}") String price) {
        return Double.parseDouble(price);
    }

    @Bean(name = "menu")
    Menu menu() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(ham());
        toppings.add(extraCheese());
        toppings.add(salami());
        toppings.add(onions());
        toppings.add(pineapple());
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizzaMargherita());
        pizzas.add(hawaiianPizza());
        pizzas.add(salamiPizza());
        List<Drink> drinks = new ArrayList<>();
        drinks.add(water());
        drinks.add(lemonade());
        drinks.add(wine());
        return new Menu(pizzas, drinks, toppings);
    }

}
