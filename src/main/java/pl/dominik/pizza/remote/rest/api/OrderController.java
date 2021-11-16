package pl.dominik.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dominik.pizza.domain.model.StatusType;
import pl.dominik.pizza.remote.rest.dto.request.AddOrderDto;
import pl.dominik.pizza.remote.rest.dto.request.UpdatedOrderDto;
import pl.dominik.pizza.remote.rest.dto.response.OrderCollectionDto;
import pl.dominik.pizza.remote.rest.dto.response.OrderDto;
import pl.dominik.pizza.remote.rest.dto.response.TokenDto;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {

    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto) {
        return ResponseEntity.ok(null);
    }
    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status") StatusType orderStatus,
                                                        @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token,
                                            @PathVariable("order-id") Integer orderId) {
        return ResponseEntity.ok(). build();
    }
    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> updateOrder(@RequestHeader("Access-Token") String token,
                                                @PathVariable("order-id") Integer orderId,
                                                @RequestBody UpdatedOrderDto updatedOrderDto) {
        return ResponseEntity.ok(null);
    }
}
