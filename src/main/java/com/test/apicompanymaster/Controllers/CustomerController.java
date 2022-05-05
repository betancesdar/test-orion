package com.test.apicompanymaster.Controllers;

import com.test.apicompanymaster.Entities.Customer;
import com.test.apicompanymaster.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;
    //Request Get
    @GetMapping
    private ResponseEntity<List<Customer>> getAllCustomers(){return ResponseEntity.ok(customerServices.findAll());}

    @PostMapping
    private ResponseEntity<Customer> saveCustomer (@ResponseBody Customer customer){
        try{
            Customer customerSaved =customerServices.save(customer);
            return ResponseEntity.created(new URI("/customer/"+customerSaved.getId())).body(customerSaved);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
