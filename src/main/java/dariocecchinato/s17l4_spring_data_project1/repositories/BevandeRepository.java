package dariocecchinato.s17l4_spring_data_project1.repositories;

import dariocecchinato.s17l4_spring_data_project1.entities.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BevandeRepository extends JpaRepository<Bevanda, Long> {

    Bevanda findByNome(String nome);

    boolean existsByNome(String nome);
}
