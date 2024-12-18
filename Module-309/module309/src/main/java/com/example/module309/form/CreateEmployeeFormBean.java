package com.example.module309.form;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {

    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;
    private String vacationHours;
    private String reportsTo;
}
