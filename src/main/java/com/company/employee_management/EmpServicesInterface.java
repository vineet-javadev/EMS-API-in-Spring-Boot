package com.company.employee_management;

import java.util.List;

public interface EmpServicesInterface {
    Employee getEmployee(Long id);

    List<Employee> getAllEmployees();

    Boolean addEmployee(Employee data);

    Boolean deleteEmployee(Long id);

    Boolean updateEmployee(Long id, Employee data);
}
