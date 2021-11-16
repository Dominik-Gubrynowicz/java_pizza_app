package pl.dominik.pizza.remote.rest.dto.response;

import pl.dominik.pizza.domain.model.StatusType;
import pl.dominik.pizza.remote.rest.dto.common.PersonOrderDto;
import pl.dominik.pizza.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private StatusType status;
    private List<PizzaOrderDto> pizza;
    private PersonOrderDto person;

    public OrderDto(Integer id, StatusType status, List<PizzaOrderDto> pizza, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizza = pizza;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizza() {
        return pizza;
    }

    public void setPizza(List<PizzaOrderDto> pizza) {
        this.pizza = pizza;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
