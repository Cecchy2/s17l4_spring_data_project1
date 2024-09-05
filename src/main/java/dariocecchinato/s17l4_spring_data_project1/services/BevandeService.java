package dariocecchinato.s17l4_spring_data_project1.services;

import dariocecchinato.s17l4_spring_data_project1.entities.Bevanda;
import dariocecchinato.s17l4_spring_data_project1.exceptions.SavingException;
import dariocecchinato.s17l4_spring_data_project1.repositories.BevandeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BevandeService {
    @Autowired
    private BevandeRepository bevandeRepository;


    public void saveBevanda(Bevanda newBevanda){
        if (bevandeRepository.existsByNome(newBevanda.getNome())) throw new SavingException("La bevanda esiste già");
        bevandeRepository.save(newBevanda);
        log.info("La bevanda " + newBevanda.getNome() + " è stata aggiunta");
    }
}
