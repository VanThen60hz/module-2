package m2_case_study.FuramaManager.service;

import m2_case_study.FuramaManager.model.Customer;
import m2_case_study.FuramaManager.util.ConstantUtil.Gender;
import m2_case_study.FuramaManager.util.ConstantUtil.TypeCustomer;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customer> customers = new LinkedList<>();

    static {
        customers.add(new Customer("C1", "Phong Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "phongnna@gmail.com", "19 Le Do", TypeCustomer.SILVER));
        customers.add(new Customer("C2", "Quoc Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "quocnnanna@gmail.com", "02 Quang Trung", TypeCustomer.SILVER));
        customers.add(new Customer("C3", "Quoc Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "quocnnanna@gmail.com", "02 Quang Trung", TypeCustomer.SILVER));
        customers.add(new Customer("C4", "Dung Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "quocnnanna@gmail.com", "02 Quang Trung", TypeCustomer.SILVER));
        customers.add(new Customer("C5", "Toan Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "quocnnanna@gmail.com", "02 Quang Trung", TypeCustomer.SILVER));
        customers.add(new Customer("C6", "My Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "quocnnanna@gmail.com", "02 Quang Trung", TypeCustomer.SILVER));
        customers.add(new Customer("C7", "Linh Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "quocnnanna@gmail.com", "02 Quang Trung", TypeCustomer.SILVER));
    }

    @Override
    public void create(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void update(Customer customer) {
        int index = customers.indexOf(customer);
        customers.set(index, customer);
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Optional<Customer> get(String code) {
        return customers.stream().filter(e-> e.getCode().equals(code)).findFirst();
    }
}