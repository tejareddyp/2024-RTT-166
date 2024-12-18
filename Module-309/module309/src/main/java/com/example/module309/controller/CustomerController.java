package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import com.example.module309.form.CreateCustomerFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@Slf4j
@Controller
public class CustomerController {
    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstName) {
        ModelAndView response = new ModelAndView();

        response.setViewName("customer/search");

        response.addObject("search", firstName);



        if ( firstName != null ) {
            List<Customer> customers = customerDAO.findByFirstname(firstName);
            response.addObject("customersKey", customers);

        }

        return response;
    }

    //This just shows us the create page for the first time when the user goes to the page
   @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView();

        List<Employee> employees = employeeDAO.findAllEmployees();
        response.addObject("employeesKey", employees);

       LOG.debug("DEBUG LEVEL");
       LOG.info("INFO LEVEL");
       LOG.warn("WARNING LEVEL");
       LOG.error("ERROR LEVEL");

        response.setViewName("customer/create");

        return response;
   }

   @GetMapping("/customer/edit/{customerId}")
   public ModelAndView editCustomer(@PathVariable Integer customerId) {
        ModelAndView response = new ModelAndView();

        response.setViewName("customer/create");

        LOG.debug("-------Editing customer------" + customerId);

        Customer customer = customerDAO.findById(customerId);

        CreateCustomerFormBean form = new CreateCustomerFormBean();


        form.setId(customer.getId());
        form.setCompanyName(customer.getCustomerName());
        form.setFirstName(customer.getContactFirstname());
        form.setLastName(customer.getContactLastname());
        form.setAddressLine1(customer.getAddressLine1());
        form.setPhone(customer.getPhone());
        form.setCity(customer.getCity());
        form.setCountry(customer.getCountry());
        form.setEmployeeId(customer.getSalesRepEmployeeId());

        response.addObject("form", form);

        List<Employee> employees = employeeDAO.findAllEmployees();
        response.addObject("employeesKey", employees);

        return response;
   }

   @GetMapping("/customer/createCustomer")
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {

        ModelAndView response = new ModelAndView();


        LOG.debug(form.toString());

        if(bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                LOG.debug(error.toString());
            }
            response.setViewName("customer/create");
            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);

            List<Employee> employees = employeeDAO.findAllEmployees();
            response.addObject("employeesKey", employees);

        } else {
            Customer customer = customerDAO.findById(form.getId());
            if (customer == null) {
                customer = new Customer();
            }


            customer.setCustomerName((form.getCompanyName()));
            customer.setContactFirstname(form.getFirstName());
            customer.setContactLastname(form.getLastName());
            customer.setPhone(form.getPhone());
            customer.setAddressLine1(form.getAddressLine1());
            customer.setCity(form.getCity());
            customer.setCountry(form.getCountry());

            Employee employee = employeeDAO.findById(form.getEmployeeId());
            customer.setEmployee(employee);

            customerDAO.save(customer);

            LOG.debug("-------Saving customer------" + customer.getId());

            response.setViewName("redirect:customer/edit" + customer.getId());
        }

       return response;
   }
}
