package org.example.database.dao;

import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.junit.Test;
import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomerDAOTest {

    private CustomerDAO customerDAO = new CustomerDAO();

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @Test

    public void findCustomerByIdTest() {
    //given

        int givenCustomerId = 125;

    //when
        Customer actual = customerDAO.findCustomerById(givenCustomerId);

    //then
        Assertions.assertEquals("Havel & Zbyszek Co", actual.getCustomerName());
        Assertions.assertEquals(givenCustomerId, actual.getId());
        Assertions.assertEquals(0.00,actual.getCreditLimit());
    }

    @Test
    public void createCustomer() {
        // given
        // Customer given = new Customer();

        Customer given = new Customer();

        given.setCustomerName("New Customer");
        given.setContactFirstname("Eric");
        given.setContactLastname("Eric");
        given.setPhone("5555551212");
        given.setAddressLine1("5555551212");
        given.setAddressLine1("222222");
        given.setCity("city");
        given.setState("asdfasdf");
        given.setPostalCode("023432");
        given.setCountry("USA");
        given.setCreditLimit(234.33);

        Employee employee = employeeDAO.findById(1216);

        given.setEmployee(employee);

        // when
        // we want to make sure taht the given .getid is null before we insert to the database
        Assertions.assertNull(given.getId());
        Customer actual = customerDAO.createCustomer(given);
        // also totally acceptable to requery the item that you just created
        // Customer actual = customerDAO.findByCustomerName("New Customer");

        // then
        // we want to make sure that the object now has an id
        Assertions.assertNotNull(actual.getId());
        Assertions.assertNull(actual.getSalesRepEmployeeId());

        Assertions.assertEquals(given.getContactFirstname(), actual.getContactFirstname());
        Assertions.assertEquals(given.getContactLastname(), actual.getContactLastname());

        // create an additional assertion to check the employee id is correct
        Assertions.assertEquals(employee.getId(), actual.getEmployee().getId());
    }



        @ParameterizedTest
        @CsvSource({
                "103, Atelier graphique",
                "112, Signal Gift Stores",
                "114, 'Australian Collectors, Co.'"
        })
        public void findByIdTest(int customerId, String customerName) {
            // this is not a very good test . just doing it to show how this works
            // given
            // when
            Customer actual = customerDAO.findCustomerById(customerId);

            // then
            Assertions.assertEquals(customerName, actual.getCustomerName());
        }




    }




