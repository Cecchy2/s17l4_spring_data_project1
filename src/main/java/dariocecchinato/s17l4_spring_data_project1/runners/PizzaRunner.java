package dariocecchinato.s17l4_spring_data_project1.runners;



import dariocecchinato.s17l4_spring_data_project1.entities.Pizza;
import dariocecchinato.s17l4_spring_data_project1.entities.Topping;

import dariocecchinato.s17l4_spring_data_project1.exceptions.SavingException;
import dariocecchinato.s17l4_spring_data_project1.services.PizzaService;
import dariocecchinato.s17l4_spring_data_project1.services.ToppingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
@Order(2)
public class PizzaRunner implements CommandLineRunner {
    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private ToppingsService toppingsService;


    @Override
    public void run(String... args) throws Exception {

        Topping tomato = toppingsService.findByName("tomato");
        Topping cheese = toppingsService.findByName("cheese");
        Topping ham = toppingsService.findByName("ham");
        Topping onions = toppingsService.findByName("onions");
        Topping pineapple = toppingsService.findByName("pineapple");
        Topping salami = toppingsService.findByName("salami");

        Pizza margherita = new Pizza("Margherita", 4.99, 1104);
        margherita.addTopping(tomato);
        margherita.addTopping(cheese);

        Pizza hawaianPizza = new Pizza("Hawaian Pizza", 6.49, 1024);
        hawaianPizza.addTopping(tomato);
        hawaianPizza.addTopping(cheese);
        hawaianPizza.addTopping(ham);
        hawaianPizza.addTopping(pineapple);

        Pizza salamiPizza = new Pizza("Salami Pizza", 5.99, 1160);
        salamiPizza.addTopping(tomato);
        salamiPizza.addTopping(cheese);
        salamiPizza.addTopping(salami);

        try{
            pizzaService.savePizza(margherita);
            pizzaService.savePizza(hawaianPizza);
            pizzaService.savePizza(salamiPizza);
        }catch (SavingException e){
            System.out.println(e.getMessage()); ;
        }
    }

}

