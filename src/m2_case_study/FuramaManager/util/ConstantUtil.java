package m2_case_study.FuramaManager.util;

public interface ConstantUtil {
    enum RentType {
        DAY,
        MONTH,
        YEAR
    }

    enum RoomType {
        STANDARD,
        SUPERIOR,
        DELUXE,
        SUITE,
        PRESIDENTIAL
    }

    enum TypeCustomer{
        DIAMOND,
        PLATINUM,
        GOLD,
        SILVER,
        MEMBER
    }

    enum Degree{
        INTERMEDIATE,
        ASSOCIATE,
        BACHELOR,
        MASTER,
        DOCTOR,
        PROFESSOR
    }

    enum Position{
        Receptionist,
        ATTENDANT,
        SUPERVISOR,
        SECURITY,
        HR,
        SALES,
        DIRECTOR,
        CHEF,
        MANAGER
    }

    enum Gender{
        MALE,
        FEMALE,
        UNKNOWN
    }

    interface PROMOTION{
        Integer TEN_PERCENT = 10;
        Integer TWENTY_PERCENT = 20;
        Integer FIFTY_PERCENT = 50;
    }

    interface FilePath{
        String EMPLOYEE = "src/m2_case_study/FuramaManager/data/employee.csv";
        String CUSTOMER = "src/m2_case_study/FuramaManager/data/customer.csv";
        String FACILITY = "src/m2_case_study/FuramaManager/data/facility.csv";
    }

    interface Regex{
        String VILLA = "SVVL-\\d{4}";
        String HOUSE = "SVHO-\\d{4}";
        String ROOM = "SVRO-\\d{4}";
        String SERVICE_NAME = "[A-Z][a-z]+";
    }
}