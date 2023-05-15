package m2_case_study.FuramaManager.model;

import m2_case_study.FuramaManager.util.ConstantUtil.RoomType;
import m2_case_study.FuramaManager.util.ConstantUtil.RentType;

public class Villa extends Facility{
    private RoomType roomType;
    private double areaPool;
    private int numberOfFloor;

    public Villa(RoomType roomType, double areaPool, int numberOfFloor) {
        this.roomType = roomType;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String code, String name, double areaUsed, double price, int maxPeople, RentType rentType, RoomType roomType, double areaPool, int numberOfFloor) {
        super(code, name, areaUsed, price, maxPeople, rentType);
        this.roomType = roomType;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomType=" + roomType +
                ", areaPool=" + areaPool +
                ", numberOfFloor=" + numberOfFloor +
                "} " + super.toString();
    }
}