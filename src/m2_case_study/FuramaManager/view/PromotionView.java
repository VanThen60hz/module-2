package m2_case_study.FuramaManager.view;

import m2_case_study.FuramaManager.controller.PromotionController;
import m2_case_study.FuramaManager.util.CommonUtil;
import m2_case_study.FuramaManager.model.Customer;

import java.util.Map;

public class PromotionView {
    private static PromotionController promotionController = new PromotionController();

    public static void show(){
        System.out.println("----- Promotion View: ------\n"+
                "1. Display list customers use service\n"+
                "2. Display list customers get voucher\n"+
                "3. Return main menu");

        int choice= CommonUtil.getChoice(1,3);

        switch (choice) {
            case 1 -> {
                int year = Integer.parseInt(CommonUtil.inputWithOutEmpty("Input year to filter"));
                promotionController.getCustomerUseService(year).forEach(System.out::println);
            }
            case 2 -> {
                int amountOfTenPercent = CommonUtil.inputToInteger("Input amount 10% discount voucher");
                int amountOfTwentyPercent = CommonUtil.inputToInteger("Input amount 20% discount voucher");
                int amountOfFiftyPercent = CommonUtil.inputToInteger("Input amount 50% discount voucher");
                Map<Customer, Integer> promotions = promotionController.getCustomerVoucher(amountOfTenPercent, amountOfTwentyPercent, amountOfFiftyPercent);

                promotions.entrySet().forEach(e -> System.out.println(e.getKey() + ". Voucher:" + e.getValue() + "%"));
            }
            case 3 -> HomeView.displayHomeMenu();
        }
    }
}