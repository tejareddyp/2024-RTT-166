package com.example.module309.database.dao;


import com.example.module309.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    //this is jpa/hibernate/hql/jql query
    @Query("select e from Employee e where e.firstName = :firstname")

            List<Employee> findByFirstName(String firstname);

    Employee findById(Integer id);

    //native query
    @Query(value = "select * from employees order by lastname asc;", nativeQuery = true)
    List<Employee> findAllEmployees();


}
