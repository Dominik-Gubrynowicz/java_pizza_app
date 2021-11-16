package pl.dominik.pizza.data.entity.ordersize;

import javax.persistence.*;

@Entity
@Table(name = "orders_sizes")
public class OrdersSizesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer order_id;

    @Column(name = "size_id")
    private Integer size_id;

    @Column(name = "size_count")
    private Integer size_count;
}
