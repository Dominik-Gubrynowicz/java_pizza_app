package pl.dominik.pizza.data.entity.size;

import pl.dominik.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "sizes")
public class SizeEintity {
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
}
