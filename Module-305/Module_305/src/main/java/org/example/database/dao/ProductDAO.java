package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Product;
import org.example.database.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    // at the class member level make your session factory ... for all DAO
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update(Product product) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        try {
            session.merge(product);

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }

        session.close();

    }

    public void create(Product product) {
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.persist(product);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Product product) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.delete(product);
        session.getTransaction().commit();
        session.close();
    }


    // ** This query gets created in every single DAO you make **
    public Product findById(Integer id) {
        // Hibernate queries must use the java names from the entities
        // this is HQL
        String hqlQuery = "SELECT p FROM Product p WHERE p.id = :productId";
        // this is what is called native SQL - the native query only included here to show the difference
        // between HQL and native
        //String nativeSqlQuery = "select * from products where id = ?";

        // this is needed to get the database connection and let hibernate run the query
        Session session = factory.openSession();

        // hibernate uses this typed query to execute the query and fill "hydrate" the entity with the data from the database
        // passing in the HQL query and setting the datatype for hibernate to use
        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);

        // now we can set the parameter on the query
        // the int id is the value that we want to substitute into the query at the
        // :productId location
        query.setParameter("productId", id);

        // we know this is a primary key so this query will return 0 recrods or 1 record
        // if the product was not found in the database we want to return null from our function
        // otherwise we want to return our product
        // hibernate will run the query and create a new product entity and fill it up with the data for us
        try {
            Product result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            // no result was found . for any number of reasons
            System.out.println("Exception found");
            return null;
        } finally {
            // have to close the session at the end . which tells hibernate to give the connection back to the pool
            session.close();
        }

    }

    public List<Product> search(String name) {

        String hqlQuery = "SELECT p FROM Product p WHERE p.productName LIKE concat('%', :name, '%') order by p.buyPrice";
        Session session = factory.openSession();

        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);
        query.setParameter("name", name);

        try {
            List<Product> result = query.getResultList();
            return result;
        } catch ( Exception e ) {
            return new ArrayList<>();
        }
        finally {
            session.close();
        }
    }
    public List<Product> findByOrderId(int orderId) {
        String hqlQuery = "SELECT p FROM Product p, OrderDetail od WHERE p.id = od.productId and od.orderId = :orderId";
        Session session = factory.openSession();
        TypedQuery<Product> query = session.createQuery(hqlQuery,Product.class);
        query.setParameter("orderId",orderId);
        try {
            List<Product> result = query.getResultList();
            return result;
        } catch ( Exception e ) {
            return new ArrayList<>();
        } finally {
            session.close();
        }
    }
}
