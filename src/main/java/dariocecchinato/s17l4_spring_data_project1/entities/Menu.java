package dariocecchinato.s17l4_spring_data_project1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private final List<MenuData> datas;

    public Menu() {
        this.datas = new ArrayList<>();
    }



    public void addData(MenuData data){
        this.datas.add(data);
    }


    @Override
    public String toString() {
        return "Menu" + datas;
    }
}
