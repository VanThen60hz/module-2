package m2_case_study.FuramaManager.model;

import m2_case_study.FuramaManager.util.ConstantUtil.RentType;

public class Room extends Facility {
    private String freeAttachService;

    public Room(String freeAttachService) {
        this.freeAttachService = freeAttachService;
    }

    public Room(String code, String name, double areaUsed, double price, int maxPeople, RentType rentType, String freeAttachService) {
        super(code, name, areaUsed, price, maxPeople, rentType);
        this.freeAttachService = freeAttachService;
    }

    public String getFreeAttachService() {
        return freeAttachService;
    }

    public void setFreeAttachService(String freeAttachService) {
        this.freeAttachService = freeAttachService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeAttachService='" + freeAttachService + '\'' +
                "} " + super.toString();
    }
}