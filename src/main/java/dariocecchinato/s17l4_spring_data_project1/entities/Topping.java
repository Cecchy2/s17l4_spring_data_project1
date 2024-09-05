package dariocecchinato.s17l4_spring_data_project1.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Topping extends MenuData {

    public Topping() {
    }

    public Topping(String nome, double prezzo, int valoriNutrizionali) {
        super(nome, prezzo, valoriNutrizionali);
    }

    @Override
    public String toString() {
        return "• Topping: " + getNome() + " prezzo" + getPrezzo() + " valori Nutrizionali " + getValoriNutrizionali();
    }
}

