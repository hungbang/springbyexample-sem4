package com.microsoft.controller;

import com.microsoft.dto.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @RequestMapping(method = RequestMethod.GET)
    public String getCustomers(Model model){
        Set<Customer> customers = prepareDate();
        model.addAttribute("customers",customers);
        return "showCustomer";
    }

    private Set<Customer> prepareDate() {
        Set<Customer> customers = new HashSet<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Henry");
        customer.setAddress("Phan Chau Trinh, Da Nang");
        customers.add(customer);
        return customers;
    }

}
