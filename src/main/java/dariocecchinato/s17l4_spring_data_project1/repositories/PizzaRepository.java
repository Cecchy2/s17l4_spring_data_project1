package dariocecchinato.s17l4_spring_data_project1.repositories;

import dariocecchinato.s17l4_spring_data_project1.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Long> {

    boolean existsByNome(String nome);
}
