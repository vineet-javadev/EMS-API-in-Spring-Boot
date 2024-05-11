package com.company.employee_management;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empTableExtend")
public class empEntity {
    @Id
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