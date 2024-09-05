package dariocecchinato.s17l4_spring_data_project1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Topping extends MenuData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizzas;

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

