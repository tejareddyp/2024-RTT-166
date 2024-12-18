package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping(value = { "/index", "/index123" })
    public ModelAndView index(@RequestParam(required = false) String search) {

        ModelAndView response = new ModelAndView();

        //this is our index.jsp
        response.setViewName("index");


        List<Customer> firstNames = customerDAO.findByFirstname("Alexander");
        for ( Customer c : firstNames ) {
            System.out.println(c.toString());
        }

        response.addObject("names", firstNames);
        return response;
    }



    @GetMapping("/abc123")
    public ModelAndView abc123() {
        ModelAndView response = new ModelAndView();

        System.out.println("abc123");

        response.setViewName("xyz789");

        return response;
    }



}