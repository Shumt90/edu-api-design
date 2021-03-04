package edu.swagger.demo.api;

import edu.swagger.demo.model.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/merch-service/customer")
public class CustomerApi {


    @PostMapping
    CustomerDTO createCustomer(CustomerDTO dto) {

        return null;

    }

    @PutMapping
    CustomerDTO updateCustomer(CustomerDTO dto) {

        return null;

    }

    @GetMapping()
    CustomerDTO getCustomer(Long id) {

        return null;

    }

    @DeleteMapping
    void deleteCustomer(Long id) {
    }


}
