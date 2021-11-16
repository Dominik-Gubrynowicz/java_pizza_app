package pl.dominik.pizza.remote.rest.dto.response;

import java.util.List;

public class MenuDto {

    private List<PizzaDto> pizzas;

    public MenuDto(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}
