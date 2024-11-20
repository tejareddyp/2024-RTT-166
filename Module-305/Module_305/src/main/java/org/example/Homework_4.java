package org.example;

import org.example.database.dao.OrdersDAO;
import org.example.database.dao.OrderDetailsDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;


public class Homework_4 {

    public static void main ( String[] args) {
        ProductDAO productDAO = new ProductDAO();
        OrdersDAO orderDao = new OrdersDAO();
        OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO();

        Order o = orderDao.findOrderById(10100);
        Product p = productDAO.findById(1);

        OrderDetail od = orderDetailsDAO.findByOrderIdAndProductId(o.getId(), p.getId());

        if (od == null) {
            od = new OrderDetail();

            // this is a create because the combination of orderid and productid was not found in the database so we can create it
            // these 2 lines of code will no longer work because I added annotations
            od.setOrderId(o.getId());
           od.setProductId(p.getId());
           // od.setOrder(o);
           // od.setProduct(p);

            od.setQuantityOrdered(100);
            od.setPriceEach(1.99);
            od.setOrderLineNumber(1);

            orderDetailsDAO.createOrderDetail(od);
        } else {
            // this is the case where the item already exists as part of the order
            od.setQuantityOrdered( od.getQuantityOrdered() + 100);
            orderDetailsDAO.updateOrderDetail(od);
        }

    }

}
