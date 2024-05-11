package com.company.employee_management;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long empId;
    private String empFirstName;
    private String empMiddleName;
    private String empLastName;
    private String empGender;
    private String empDOB;
    private String empDOJ;
    private String empCTC;
    private String empContact;
    private String empEmail;
    private String empAddress;
    private String empCity;
    private String empState;
    private Integer empZip;
    private Boolean empIsManager;

}
