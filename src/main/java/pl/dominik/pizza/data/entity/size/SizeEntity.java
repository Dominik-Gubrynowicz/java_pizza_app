package pl.dominik.pizza.data.entity.size;

import pl.dominik.pizza.data.entity.ordersize.OrdersSizesEntity;
import pl.dominik.pizza.data.entity.pizza.PizzaEntity;
import pl.dominik.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "sizes")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private SizeType sizeType;

    @Column(name = "base_price")
    private BigDecimal price;

    @Column(name = "pizza_id")
    private Integer pizza_id;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;

    @OneToMany(mappedBy = "size_id")
    private Set<OrdersSizesEntity> orderSizes;
}
