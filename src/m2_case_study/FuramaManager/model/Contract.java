package m2_case_study.FuramaManager.model;

import java.util.Objects;

public class Contract {
    private String code;
    private String bookingCode;
    private double downPayment;
    private double totalPayment;
    private String customerCode;

    public Contract(String code, String bookingCode, double downPayment, double totalPayment, String customerCode) {
        this.code = code;
        this.bookingCode = bookingCode;
        this.downPayment = downPayment;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(code, contract.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "code='" + code + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", downPayment=" + downPayment +
                ", totalPayment=" + totalPayment +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}