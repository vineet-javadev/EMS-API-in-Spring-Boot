package com.company.employee_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// @CrossOrigin("*")
@CrossOrigin(origins = { "http://localhost:3000/" }) // up and down both are same
@RestController
public class MyController {

    @Autowired(required = true)
    EmpServicesInterface obj;

    @GetMapping("empManagement")
    public List<Employee> getAllEmployees() {
        return obj.getAllEmployees();
    }

    @GetMapping("empManagement/{id}")
    public Employee getSingleEmp(@PathVariable Long id) {
        return obj.getEmployee(id);
    }

    @PostMapping("empManagement")
    public Boolean postAddEmp(@RequestBody Employee entity) {
        return obj.addEmployee(entity);
    }

    @DeleteMapping("empManagement/{id}")
    public String deleteSingleEmp(@PathVariable Long id) {
        if (obj.deleteEmployee(id)) {
            return "Delete Successfully";
        }
        return "Data Not Found!";
    }

    @PutMapping("empManagement/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee entity) {
        if (obj.updateEmployee(id, entity)) {
            return "Update Successfully";
        }
        return "Data Not Found!";
    }

    @GetMapping("/Home")
    public String home() {
        return "index";
    }

}
