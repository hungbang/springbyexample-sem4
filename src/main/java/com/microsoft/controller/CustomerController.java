package com.microsoft.controller;

import com.microsoft.dto.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/customers")
public class CustomerController {



    @RequestMapping(method = RequestMethod.GET)
    public String getCustomers(Model model){
//        Set<Customer> customers = prepareDate();
//        model.addAttribute("customers",customers);
//        return "showCustomer";
        Customer customer
                 = new Customer();
        model.addAttribute("customer", customer);
        return "add-customer";
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


    @RequestMapping(method = RequestMethod.POST)
    public String addNewCustomer(@Valid @ModelAttribute("customer") Customer customer,
                                 BindingResult result){
        if(customer == null)
            return "errorpage";

        boolean validate = false;

        if(customer.getAddress().isEmpty())
        {
            result.rejectValue("address", "error.address");
            validate = true;
        }

        if(customer.getFirstName().isEmpty())
        {
            result.rejectValue("firstName", "error.firstName");
            validate = true;
        }
        if (customer.getLastName().isEmpty()) {
            result.rejectValue("lastName", "error.lastName");
            validate = true;
        }

        if(validate){
            return "add-customer";
        }
        System.out.println("customer.getFirstName(): "+ customer.getFirstName());
        //save this data to db.
        return "success";
    }

}
