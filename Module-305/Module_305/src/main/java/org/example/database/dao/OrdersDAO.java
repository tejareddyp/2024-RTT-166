package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Order;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrdersDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update(Order order) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        try {
            session.merge(order);

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }

        session.close();

    }

    public void create(Order order) {
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.persist(order);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Order order) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.delete(order);
        session.getTransaction().commit();
        session.close();
    }

    public Order findById(Integer id) {

        String hqlQuery = "SELECT o FROM Order o WHERE o.id = :orderId";

        Session session = factory.openSession();


        TypedQuery<Order> query = session.createQuery(hqlQuery, Order.class);


        query.setParameter("orderId", id);


        try {
            Order result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            // no result was found . for any number of reasons
            return null;
        } finally {
            // have to close the session at the end . which tells hibernate to give the connection back to the pool
            session.close();
        }

    }

    public Order findOrderById(Integer id) {
        Session session = factory.openSession();

        String hql = "SELECT o from Order o where o.id = :orderid";

        TypedQuery<Order> query = session.createQuery(hql, Order.class);
        query.setParameter("orderid", id);

        try{
            Order order = query.getSingleResult();
            return order;
        }catch(Exception e) {
            return null;
        }finally {
            session.close();
        }
    }
}
