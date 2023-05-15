package m2_case_study.FuramaManager.view;

import m2_case_study.FuramaManager.controller.ContractController;
import m2_case_study.FuramaManager.controller.BookingController;
import m2_case_study.FuramaManager.controller.CustomerController;
import m2_case_study.FuramaManager.controller.FacilityController;
import m2_case_study.FuramaManager.util.CommonUtil;
import m2_case_study.FuramaManager.model.Booking;
import m2_case_study.FuramaManager.model.Contract;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;

public class BookingView {
    private static BookingController bookingController = new BookingController();
    private static CustomerController customerController = new CustomerController();
    private static FacilityController facilityController = new FacilityController();
    private static ContractController contractController = new ContractController();

    public static void show() {
        System.out.println("----- Booking View: ------\n" +
                "1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contract\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");

        int choice = CommonUtil.getChoice(1,7);

        switch (choice) {
            case 1 -> {
                System.out.println("----- List customer ---");
                customerController.findAll().forEach(System.out::println);
                String customerCode = CommonUtil.inputWithOutEmpty("Enter customer code to booking");

                System.out.println("----- List service ---");
                facilityController.findAll().forEach(System.out::println);
                String serviceCode = CommonUtil.inputWithOutEmpty("Enter service code to booking");

                String bookingCode = CommonUtil.inputWithOutEmpty("Booking Code");

                String stStartDate = CommonUtil.inputWithOutEmpty("Start Date");
                LocalDate startDate = LocalDate.parse(stStartDate, CommonUtil.getDateFormat());

                String stEndDate = CommonUtil.inputWithOutEmpty("End Date");
                LocalDate endDate = LocalDate.parse(stEndDate, CommonUtil.getDateFormat());

                Booking booking = new Booking(bookingCode, startDate, endDate, customerCode, serviceCode);
                bookingController.create(booking);
                System.out.println("Booking successfully!");
            }
            case 2 -> bookingController.findAll().forEach(System.out::println);
            case 3 -> {
                Deque<Booking> bookings = new ArrayDeque<>(bookingController.findAll());
                while (!bookings.isEmpty()) {
                    Booking booking = bookings.pollLast();
                    if (!booking.isContract()) {
                        String bookCode = booking.getCode();
                        String cusCode = booking.getCustomerCode();
                        System.out.println("Please create contract for " + bookCode);
                        String code = CommonUtil.inputWithOutEmpty("Contract Code");
                        double down = CommonUtil.inputToDouble("Down Payment");
                        double total = CommonUtil.inputToDouble("Total Payment");

                        Contract contract = new Contract(code, booking.getCode(), down, total, cusCode);
                        contractController.create(contract);
                        booking.setContract(true);
                        System.out.println("Created successful for " + bookCode);
                    }
                }

                System.out.println("No Bookings for create contract");
            }
            case 4 -> contractController.findAll().forEach(System.out::println);
            case 5 -> {
                System.out.println("----- List contract ---");
                contractController.findAll().forEach(System.out::println);

                String code = CommonUtil.inputWithOutEmpty("Enter contract code to edit");
                double down = CommonUtil.inputToDouble("Down Payment");
                double total = CommonUtil.inputToDouble("Total Payment");
                System.out.println("----- List customer ---");
                customerController.findAll().forEach(System.out::println);
                String cusCode = CommonUtil.inputWithOutEmpty("Enter customer code to booking");
                System.out.println("----- List booking ---");
                bookingController.findAll().forEach(System.out::println);
                String bookCode = CommonUtil.inputWithOutEmpty("Enter booking code to edit");
                Contract contract = new Contract(code, bookCode, down, total, cusCode);
                contractController.update(contract);
                System.out.println("Updated successfully!");
            }
            case 6 -> HomeView.displayHomeMenu();
        }
    }
}