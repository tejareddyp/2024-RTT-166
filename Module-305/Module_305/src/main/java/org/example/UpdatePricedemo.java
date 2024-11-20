package org.example;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

public class UpdatePricedemo {

    public static void main(String[] args) {

        ProductDAO productDAO = new ProductDAO();

        Product p = productDAO.findById(1);

        System.out.println(p);

        p.setProductCode("BBBBBBBBBB");

        productDAO.update(p);

        System.out.println("After: " + p);
    }
}
