package m2_case_study.FuramaManager.model;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private String code;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerCode;
    private String facilityCode;
    private boolean isContract;

    public Booking(String code, LocalDate startDate, LocalDate endDate, String customerCode, String facilityCode) {
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.facilityCode = facilityCode;
    }

    public boolean isContract() {
        return isContract;
    }

    public void setContract(boolean contract) {
        isContract = contract;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    @Override
    public int compareTo(Booking o) {
        int tmp = o.getStartDate().compareTo(getStartDate());
        return tmp != 0 ? tmp : o.getEndDate().compareTo(getEndDate());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(customerCode, booking.customerCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerCode);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "code='" + code + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customerCode='" + customerCode + '\'' +
                ", facilityCode='" + facilityCode + '\'' +
                ", isContracted='" + isContract + '\'' +
                '}';
    }
}