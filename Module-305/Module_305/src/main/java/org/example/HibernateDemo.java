package org.example;

import org.example.database.dao.OrderDetailsDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import java.util.List;

public class HibernateDemo {

    public static void main(String[] args) {

        ProductDAO productDao = new ProductDAO();

        Product p = productDao.findById(1);

        System.out.println("p = " + p);

        OrderDetailsDAO o = new OrderDetailsDAO();

        System.out.println(o.findByOrderId(10100));


        List<Product> p1 = productDao.findByOrderId(10100);
        System.out.println(p1);


    }
}
