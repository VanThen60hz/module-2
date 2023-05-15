package m2_case_study.FuramaManager.service;

import m2_case_study.FuramaManager.model.Facility;
import m2_case_study.FuramaManager.model.House;
import m2_case_study.FuramaManager.model.Room;
import m2_case_study.FuramaManager.model.Villa;
import m2_case_study.FuramaManager.util.ConstantUtil.RentType;
import m2_case_study.FuramaManager.util.ConstantUtil.RoomType;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FacilityServiceImpl implements FacilityService{
    private static Map<Facility, Integer> facilitys = new LinkedHashMap<>();

    static {
        House house = new House("HOU01", "Sweet House", 5, 55555, 5, RentType.MONTH, RoomType.STANDARD, 3);
        Room room = new Room("ROM1", "Single Room", 20, 20, 1, RentType.DAY, "massage");
        Villa villa = new Villa("VIL01", "Aston Villa", 12, 123, 10, RentType.MONTH, RoomType.DELUXE, 234, 3);
        Villa villa2 = new Villa("VIL02", "Aston Villa", 12, 123, 10, RentType.MONTH, RoomType.DELUXE, 234, 3);

        facilitys.put(house, 0);
        facilitys.put(room, 0);
        facilitys.put(villa, 0);
        facilitys.put(villa2, 0);
    }

    @Override
    public void create(Facility facility) {
        facilitys.put(facility, 0);
    }

    @Override
    public void update(Facility facility) {
        for (Map.Entry<Facility, Integer> f : facilitys.entrySet()){
            if(f.getKey().equals(facility)){
                facilitys.put(facility, f.getValue() + 1);
                break;
            }
        }
    }

    @Override
    public List<Facility> findAll() {
        return facilitys.keySet().stream().toList();
    }

    @Override
    public Map<Facility, Integer> findAllMaintenance() {
        return facilitys;
    }

    @Override
    public Optional<Facility> get(String code) {
        return findAll().stream().filter(e -> e.getCode().equals(code)).findFirst();
    }
}