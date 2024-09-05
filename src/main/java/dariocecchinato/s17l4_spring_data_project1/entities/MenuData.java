package dariocecchinato.s17l4_spring_data_project1.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class MenuData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double prezzo;
    private int valoriNutrizionali;

    public MenuData() {
    }

    public MenuData(String nome, double prezzo, int valoriNutrizionali) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.valoriNutrizionali = valoriNutrizionali;
    }

    @Override
    public String toString() {
        return
                " nome " + nome +
                " prezzo " + prezzo +
                " valoriNutrizionali " + valoriNutrizionali;
    }
}
