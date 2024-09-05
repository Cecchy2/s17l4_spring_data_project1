package dariocecchinato.s17l4_spring_data_project1.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Bevanda extends MenuData {

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
