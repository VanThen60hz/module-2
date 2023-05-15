package m2_case_study.FuramaManager.controller;

import m2_case_study.FuramaManager.model.Employee;
import m2_case_study.FuramaManager.service.EmployeeService;
import m2_case_study.FuramaManager.service.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    public void create(Employee e) {
        employeeService.create(e);
    }

    public void update(Employee e) {
        employeeService.update(e);
    }

    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}