package dariocecchinato.s17l4_spring_data_project1.runners;

import dariocecchinato.s17l4_spring_data_project1.entities.Bevanda;
import dariocecchinato.s17l4_spring_data_project1.exceptions.SavingException;
import dariocecchinato.s17l4_spring_data_project1.services.BevandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class BevandeRunner implements CommandLineRunner {
    @Autowired
    private BevandeService bevandeService;
    private Bevanda lemonade;
    private Bevanda wine;
    private Bevanda water;

    public BevandeRunner(BevandeService bevandeService, Bevanda water, Bevanda lemonade, Bevanda wine) {
        this.bevandeService = bevandeService;
        this.water = water;
        this.lemonade = lemonade;
        this.wine = wine;
    }

    @Override
    public void run(String... args) throws Exception {
           try{
               bevandeService.saveBevanda(lemonade);
               bevandeService.saveBevanda(water);
               bevandeService.saveBevanda(wine);
           }catch (SavingException e){
               System.out.println(e.getMessage());
           }

    }
}
