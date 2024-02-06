package harouane.U5W1D2_SpringComponents.Entities.Runners;

import harouane.U5W1D2_SpringComponents.Entities.Menu.Drinks.Drink;
import harouane.U5W1D2_SpringComponents.Entities.Menu.Menu;
import harouane.U5W1D2_SpringComponents.Entities.Menu.MenuItem;
import harouane.U5W1D2_SpringComponents.Entities.Menu.Pizza;
import harouane.U5W1D2_SpringComponents.Entities.Order;
import harouane.U5W1D2_SpringComponents.Entities.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    Menu menu;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Runner.class);
        menu.print();
        Table table = new Table(3);
        Pizza pizza1 = (Pizza) ctx.getBean("hawaiianPizza");
        Pizza pizza2 = (Pizza) ctx.getBean("pizzaMargherita");
        Pizza pizza3 = (Pizza) ctx.getBean("salamiPizza");
        Drink drink1 = (Drink) ctx.getBean("wine");
        Drink drink2 = (Drink) ctx.getBean("water");
        Drink drink3 = (Drink) ctx.getBean("lemonade");
        double priceOfTable = (double) ctx.getBean("getPriceOfSeat");
        List<MenuItem> menuItemList = new ArrayList<>(Arrays.asList(pizza1, pizza2, pizza3, drink3, drink2, drink1));
        Order order = new Order(21.00, table, menuItemList, priceOfTable);
        System.out.println(order);
    }
}
