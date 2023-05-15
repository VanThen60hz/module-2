package m2_case_study.FuramaManager.view;

import m2_case_study.FuramaManager.controller.CustomerController;
import m2_case_study.FuramaManager.model.Customer;
import m2_case_study.FuramaManager.model.Person;
import m2_case_study.FuramaManager.util.CommonUtil;
import m2_case_study.FuramaManager.util.ConstantUtil.Gender;
import m2_case_study.FuramaManager.util.ConstantUtil.TypeCustomer;

public class CustomerView {
    private static CustomerController customerController = new CustomerController();

    public static void show(){
        System.out.println("----- Customer View: ------\n"+
                "1. Display list customer\n"+
                "2. Add new customer\n"+
                "3. Edit customer\n"+
                "4. Return main menu");

        int choice= CommonUtil.getChoice(1,4);
        switch (choice) {
            case 1:
                customerController.findAll().forEach(System.out::println);
                break;
            case 2:
                String code = CommonUtil.inputWithOutEmpty("Code");
                Customer newCustomer = input();
                newCustomer.setCode(code);
                customerController.create(newCustomer);
                System.out.println("Create successfully...!");
                break;
            case 3:
                System.out.print("Input code to edit: ");
                String editCode = CommonUtil.getScanner().nextLine();
                Customer editCustomer = input();
                editCustomer.setCode(editCode);
                customerController.update(editCustomer);
                System.out.println("Update successfully...!");
                break;
            case 4:
                HomeView.displayHomeMenu();
        }
    }

    private static Customer input() {
        Person person = CommonUtil.inputPerson();
        TypeCustomer typeCustomer = CommonUtil.inputToEnum(TypeCustomer.class, "Type Customer");

        return new Customer(person.getFullName(), person.getBirthday(), person.getGender(), person.getPhone(), person.getEmail(), person.getAddress(), typeCustomer);
    }
}