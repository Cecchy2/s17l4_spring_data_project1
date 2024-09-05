package dariocecchinato.s17l4_spring_data_project1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@Entity
public class Pizza extends MenuData {
    @OneToMany
private List<Topping> toppings;

    public Pizza(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public Pizza(String nome, double prezzo, int nutritionalInfo) {
        super(nome, prezzo, nutritionalInfo);
        this.toppings = new ArrayList<>();
    }

    public Pizza() {
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "• Pizza: " + getNome() +
                 toppings +
                " , Prezzo " + getPrezzo() +
                " , Valori Nutrizionali "+ getValoriNutrizionali();
    }
}
