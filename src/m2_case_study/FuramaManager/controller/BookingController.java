package m2_case_study.FuramaManager.controller;

import m2_case_study.FuramaManager.model.Booking;
import m2_case_study.FuramaManager.service.BookingService;
import m2_case_study.FuramaManager.service.BookingServiceImpl;

import java.util.List;

public class BookingController {
    private BookingService bookingService = new BookingServiceImpl();

    public void create(Booking booking){
        bookingService.create(booking);
    }

    public List<Booking> findAll(){
        return bookingService.findAll();
    }
}