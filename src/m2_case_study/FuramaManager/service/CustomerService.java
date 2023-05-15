package m2_case_study.FuramaManager.service;

import m2_case_study.FuramaManager.model.Customer;

import java.util.Optional;

public interface CustomerService extends BaseService<Customer> {
    Optional<Customer> get(String code);
}