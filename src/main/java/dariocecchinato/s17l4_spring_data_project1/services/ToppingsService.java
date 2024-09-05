package dariocecchinato.s17l4_spring_data_project1.services;

import dariocecchinato.s17l4_spring_data_project1.entities.Topping;
import dariocecchinato.s17l4_spring_data_project1.exceptions.SavingException;
import dariocecchinato.s17l4_spring_data_project1.repositories.ToppingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ToppingsService {
    @Autowired
    private ToppingRepository toppingRepository;

    public void saveTopping(Topping newTopping){

        if(toppingRepository.existsByNome(newTopping.getNome())) throw new SavingException("Questo topping è già presente nel menù");
        toppingRepository.save(newTopping);
        log.info("Il topping " + newTopping.getNome() + " è stato salvato");
    }

   public Topping findByName(String name){
        return (Topping) toppingRepository.findByNome(name);
   }

   public Topping findByNomeStartingWith (String lettere){
        return toppingRepository.findByNomeStartingWithIgnoreCase(lettere);
   }



}
