package com.company.employee_management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServices implements EmpServicesInterface {

    // private List<Employee> list = new ArrayList<>();

    @Autowired(required = true)
    EmpRepo repo;

    @Override
    public Employee getEmployee(Long id) {
        empEntity tempEntity = repo.findById(id).get();
        Employee temp = new Employee();
        BeanUtils.copyProperties(tempEntity, temp);

        return temp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<empEntity> result = repo.findAll();
        List<Employee> resultEmployee = new ArrayList<>();

        for (int i = 0; i < result.size(); i++) {
            Employee temp = new Employee();

            temp.setEmpId(result.get(i).getEmpId());
            temp.setEmpFirstName(result.get(i).getEmpFirstName());
            temp.setEmpMiddleName(result.get(i).getEmpMiddleName());
            temp.setEmpLastName(result.get(i).getEmpLastName());
            temp.setEmpGender(result.get(i).getEmpGender());
            temp.setEmpDOB(result.get(i).getEmpDOB());
            temp.setEmpDOJ(result.get(i).getEmpDOJ());
            temp.setEmpCTC(result.get(i).getEmpCTC());
            temp.setEmpContact(result.get(i).getEmpContact());
            temp.setEmpEmail(result.get(i).getEmpEmail());
            temp.setEmpAddress(result.get(i).getEmpAddress());
            temp.setEmpCity(result.get(i).getEmpCity());
            temp.setEmpState(result.get(i).getEmpState());
            temp.setEmpZip(result.get(i).getEmpZip());
            temp.setEmpIsManager(result.get(i).getEmpIsManager());

            resultEmployee.add(temp);
        }
        return resultEmployee;
    }

    @Override
    public Boolean addEmployee(Employee data) {
        empEntity temp = new empEntity();
        BeanUtils.copyProperties(data, temp);
        if (repo.save(temp) != null) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteEmployee(Long id) {
        empEntity temp = repo.findById(id).get();
        repo.delete(temp);
        return true;
    }

    @Override
    public Boolean updateEmployee(Long id, Employee data) {
        empEntity temp = repo.findById(id).get();

        temp.setEmpFirstName(data.getEmpFirstName());
        temp.setEmpMiddleName(data.getEmpMiddleName());
        temp.setEmpLastName(data.getEmpLastName());
        temp.setEmpGender(data.getEmpGender());
        temp.setEmpDOB(data.getEmpDOB());
        temp.setEmpDOJ(data.getEmpDOJ());
        temp.setEmpCTC(data.getEmpCTC());
        temp.setEmpContact(data.getEmpContact());
        temp.setEmpEmail(data.getEmpEmail());
        temp.setEmpAddress(data.getEmpAddress());
        temp.setEmpCity(data.getEmpCity());
        temp.setEmpState(data.getEmpState());
        temp.setEmpZip(data.getEmpZip());
        temp.setEmpIsManager(data.getEmpIsManager());

        if (repo.save(temp) != null) {
            return true;
        }
        return false;
    }

}
