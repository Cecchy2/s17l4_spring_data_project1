package dariocecchinato.s17l4_spring_data_project1.runners;

import dariocecchinato.s17l4_spring_data_project1.S17l4SpringDataProject1Application;
import dariocecchinato.s17l4_spring_data_project1.entities.Topping;
import dariocecchinato.s17l4_spring_data_project1.exceptions.SavingException;
import dariocecchinato.s17l4_spring_data_project1.services.ToppingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ToppingRunner implements CommandLineRunner {
    @Autowired
    private ToppingsService toppingsService;
    private final Topping tomato;
    private final Topping cheese;
    private final Topping ham;
    private final Topping onions;
    private final Topping pineapple;
    private final Topping salami;

    public ToppingRunner(ToppingsService toppingsService, Topping tomato, Topping cheese, Topping ham, Topping onions, Topping pineapple, Topping salami) {
        this.toppingsService=toppingsService;
        this.tomato = tomato;
        this.cheese = cheese;
        this.ham = ham;
        this.onions = onions;
        this.pineapple = pineapple;
        this.salami = salami;
    }
    @Override
    public void run(String... args) throws Exception {

        try{
            toppingsService.saveTopping(tomato);
            toppingsService.saveTopping(cheese);
            toppingsService.saveTopping(ham);
            toppingsService.saveTopping(onions);
            toppingsService.saveTopping(pineapple);
            toppingsService.saveTopping(salami);
        }catch (SavingException e){
            System.out.println(e.getMessage());
        }

    }}

