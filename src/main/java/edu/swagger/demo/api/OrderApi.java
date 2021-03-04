package edu.swagger.demo.api;

import edu.swagger.demo.model.OrderDTO;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/merch-service/order")
public class OrderApi {


    @PostMapping
    OrderDTO createOrder(OrderDTO dto) {

        return null;

    }

    @PutMapping
    OrderDTO updateOrder(OrderDTO dto) {

        return null;

    }

    @GetMapping
    OrderDTO getOrder(Long id) {

        return null;

    }

    @DeleteMapping
    void deleteOrder(Long id) {
    }


}
