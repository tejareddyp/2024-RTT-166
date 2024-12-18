package com.example.module309.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.awt.print.Book;
import java.util.List;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_rep_employee_id", insertable = false, updatable = false)
    @ToString.Exclude
    private Employee employee;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Order> orders;


    @Column(name = "customer_name")
    private String customerName;

    @Column( name = "contact_lastname")
    private String contactLastname;

    @Column(name = "contact_firstname")
    private String contactFirstname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "sales_rep_employee_id")
    private Integer salesRepEmployeeId;

    @Column(name = "credit_limit", columnDefinition = "DECIMAL")
    private Double creditLimit;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +


                ", customerName='" + customerName + '\'' +
                ", contactLastname='" + contactLastname + '\'' +
                ", contactFirstname='" + contactFirstname + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", salesRepEmployeeId=" + salesRepEmployeeId +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
