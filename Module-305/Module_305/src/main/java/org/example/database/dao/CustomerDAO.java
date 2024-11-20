package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
//import org.example.database.entity.Order;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update(Customer c) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        try {
            session.merge(c);

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }

        session.close();

    }

    public Customer createCustomer(Customer customer) {
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.persist(customer);
        session.getTransaction().commit();
        return customer;
       // session.close();
    }

    public void delete(Customer c) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.delete(c);
        session.getTransaction().commit();
        session.close();
    }

    public Customer findCustomerById(Integer id) {

        String hqlQuery = "SELECT c FROM Customer c WHERE c.id = :customerId";

        Session session = factory.openSession();


        TypedQuery<Customer> query = session.createQuery(hqlQuery, Customer.class);


        query.setParameter("customerId", id);


        try {
            Customer result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            // no result was found . for any number of reasons
            return null;
        } finally {
            // have to close the session at the end . which tells hibernate to give the connection back to the pool
            session.close();
        }


    }

    public List<Customer> findCustomerWithName(String name) {


        Session session = factory.openSession();

        String hqlName = "SELECT c FROM Customer c WHERE c.contactFirstname = :cName " +
                                                      " OR c.customerName = :cName  " +
                                                     " OR c.contactLastname = :cName " +
                                                       " ORDER BY C.contactFirstname ";
        TypedQuery<Customer> query = session.createQuery(hqlName, Customer.class);
        query.setParameter("cName", name);

        try {
            List<Customer> result = query.getResultList();
            return result;
        } catch ( Exception e ) {
            return new ArrayList<>();
        }
        finally {
            session.close();
        }
    }
}
