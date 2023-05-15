package m2_case_study.FuramaManager.controller;

import m2_case_study.FuramaManager.model.Booking;
import m2_case_study.FuramaManager.model.Customer;
import m2_case_study.FuramaManager.service.PromotionService;
import m2_case_study.FuramaManager.service.PromotionServiceImpl;

import java.util.List;
import java.util.Map;

public class PromotionController {
    private PromotionService promotionService= new PromotionServiceImpl();

    public List<Booking> getCustomerUseService(int year){
        return promotionService.getCustomerUseService(year);
    }

    public Map<Customer, Integer> getCustomerVoucher(int amountOfTenPercent, int amountOfTwentyPercent, int amountOfFiftyPercent){
        return promotionService.getCustomerVoucher(amountOfTenPercent, amountOfTwentyPercent, amountOfFiftyPercent);
    }
}