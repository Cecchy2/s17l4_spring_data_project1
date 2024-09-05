package dariocecchinato.s17l4_spring_data_project1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Bevanda extends MenuData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Bevanda() {
    }

    public Bevanda(String nome, double prezzo, int valoriNutrizionali) {
        super(nome, prezzo, valoriNutrizionali);
    }

    @Override
    public String toString() {
        return "• Drink: " + getNome()+ " prezzo "+ getPrezzo() + "  " + getValoriNutrizionali()+ " Cal";
    }
}
