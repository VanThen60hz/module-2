package m2_case_study.FuramaManager.service;

import m2_case_study.FuramaManager.model.Booking;
import m2_case_study.FuramaManager.model.Customer;

import java.util.List;
import java.util.Map;

public interface PromotionService {
    List<Booking> getCustomerUseService(int year);
    Map<Customer, Integer> getCustomerVoucher(int amountOfTenPercent, int amountOfTwentyPercent, int amountOfFiftyPercent);
}