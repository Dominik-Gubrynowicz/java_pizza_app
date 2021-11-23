package pl.dominik.pizza.data.entity.pizza;

import pl.dominik.pizza.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pizza_id")
    private Set<SizeEntity> sizes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
