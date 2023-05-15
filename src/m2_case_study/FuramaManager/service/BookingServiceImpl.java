package m2_case_study.FuramaManager.service;

import m2_case_study.FuramaManager.model.Booking;
import m2_case_study.FuramaManager.model.Facility;
import m2_case_study.FuramaManager.util.CommonUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService{
    private static TreeSet<Booking> bookings= new TreeSet<>();
    private FacilityService facilityService = new FacilityServiceImpl();

    static {
        LocalDate startDate= LocalDate.parse("01/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate= LocalDate.parse("05/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK01", startDate , endDate,"C1", "VIL01"));

        LocalDate startDate1= LocalDate.parse("06/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate1= LocalDate.parse("10/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK02", startDate1 , endDate1,"C1", "VIL02"));

        LocalDate startDate2= LocalDate.parse("16/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate2= LocalDate.parse("26/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK03", startDate2 , endDate2,"C2", "ROM1"));

        LocalDate startDate3= LocalDate.parse("15/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate3= LocalDate.parse("26/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK04", startDate3 , endDate3,"C3", "ROM1"));

        LocalDate startDate4= LocalDate.parse("19/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate4= LocalDate.parse("26/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK05", startDate4 , endDate4,"C4", "ROM1"));

        LocalDate startDate5= LocalDate.parse("28/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate5= LocalDate.parse("26/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK06", startDate5 , endDate5,"C5", "ROM1"));

        LocalDate startDate6= LocalDate.parse("07/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate6= LocalDate.parse("26/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK07", startDate6 , endDate6,"C6", "ROM1"));

        LocalDate startDate7= LocalDate.parse("23/01/2023", CommonUtil.getDateFormat());
        LocalDate endDate7= LocalDate.parse("26/01/2023", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK08", startDate7 , endDate7,"C7", "ROM1"));
    }

    @Override
    public void create(Booking booking) {
        bookings.add(booking);

        Optional<Facility> optionalFacility = facilityService.get(booking.getFacilityCode());
        if(optionalFacility.isPresent()) {
            facilityService.update(facilityService.get(booking.getFacilityCode()).get());
        }
    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public List<Booking> findAll() {
        return bookings.stream().toList();
    }
}