package com.example.module309.controller;

import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import com.example.module309.form.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/employee/search")
    public ModelAndView search(@RequestParam(required = false) String firstName) {
        ModelAndView response = new ModelAndView();

        response.setViewName("employee/search");

        if (firstName != null) {
            List<Employee> employees = employeeDAO.findByFirstName(firstName);
            response.addObject("employees", employees);
        }
        return response;
    }


    @GetMapping("/employee/createEmployee")
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView();
        response.setViewName("employee/create");

        System.out.println(form);
        Employee employee = new Employee();

        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setEmail(form.getEmail());
        employee.setJobTitle(form.getJobTitle());

        employeeDAO.save(employee);
        return response;


    }
}
