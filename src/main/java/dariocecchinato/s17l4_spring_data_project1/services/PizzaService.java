package dariocecchinato.s17l4_spring_data_project1.services;

import dariocecchinato.s17l4_spring_data_project1.entities.Pizza;
import dariocecchinato.s17l4_spring_data_project1.exceptions.SavingException;
import dariocecchinato.s17l4_spring_data_project1.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;


    public void savePizza(Pizza newPizza){
        if(pizzaRepository.existsByNome(newPizza.getNome())) throw new SavingException("Questa Pizza è già nel Menu");
        pizzaRepository.save(newPizza);
        log.info("La Pizza " + newPizza.getNome() + " è stata aggiunta");

    }
}
