package pl.dominik.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dominik.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.dominik.pizza.remote.rest.dto.response.PizzaDto;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping(value="/api/v1/pizzas", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaController {
    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody AddPizzaDto addPizzaDto,
                                             @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }
    @PutMapping("/{order-id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestBody AddPizzaDto addPizzaDto,
                                                @RequestHeader("Access-Token") String token,
                                                @PathVariable("order-id") Integer orderId) {
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deletePizza(@RequestHeader("Access-Token") String token,
                                              @PathVariable("order-id") Integer orderID) {
        return ResponseEntity.ok(null);
    }
}
