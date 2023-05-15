package m2_case_study.FuramaManager.controller;

import m2_case_study.FuramaManager.model.Customer;
import m2_case_study.FuramaManager.service.CustomerService;
import m2_case_study.FuramaManager.service.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    public void create(Customer e) {
        customerService.create(e);
    }

    public void update(Customer e) {
        customerService.update(e);
    }

    public List<Customer> findAll() {
        return customerService.findAll();
    }
}