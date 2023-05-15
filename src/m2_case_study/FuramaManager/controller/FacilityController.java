package m2_case_study.FuramaManager.controller;

import m2_case_study.FuramaManager.model.Facility;
import m2_case_study.FuramaManager.service.FacilityService;
import m2_case_study.FuramaManager.service.FacilityServiceImpl;

import java.util.List;
import java.util.Map;

public class FacilityController {
    private FacilityService facilityService = new FacilityServiceImpl();

    public List<Facility> findAll(){
        return facilityService.findAll();
    }

    public void create(Facility facility){
        facilityService.create(facility);
    }

    public Map<Facility, Integer> findAllMaintenance(){
        return facilityService.findAllMaintenance();
    }
}