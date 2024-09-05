package dariocecchinato.s17l4_spring_data_project1.repositories;

import dariocecchinato.s17l4_spring_data_project1.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository  extends JpaRepository<Topping,Long> {

    boolean existsByNome(String nome);
}
