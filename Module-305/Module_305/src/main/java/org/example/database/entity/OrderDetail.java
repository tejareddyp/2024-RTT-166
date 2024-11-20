package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "orderdetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    @ToString.Exclude
    private Order orders;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    @ToString.Exclude
    private Product product;




    @Column(name = "order_id", insertable = false, updatable = false)
    private int orderId;

    @Column(name = "product_id", insertable = false, updatable = false)
    private int productId;

    @Column(name = "quantity_ordered")
    private int quantityOrdered;

    @Column(name = "price_each", columnDefinition = "DECIMAL")
    private double priceEach;

    @Column(name = "order_line_number",columnDefinition = "SMALLINT")
    private int orderLineNumber;
}
