package pl.dominik.pizza.remote.rest.dto.response;

import java.math.BigDecimal;
import pl.dominik.pizza.domain.model.SizeType;

public class SizeDto {
    private Integer id;
    private SizeType size;
    private BigDecimal price;

    public SizeDto(Integer id, SizeType size, BigDecimal price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
