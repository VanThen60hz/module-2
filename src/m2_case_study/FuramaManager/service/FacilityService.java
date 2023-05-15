package m2_case_study.FuramaManager.service;

import m2_case_study.FuramaManager.model.Facility;

import java.util.Map;
import java.util.Optional;

public interface FacilityService extends BaseService<Facility> {
    Map<Facility, Integer> findAllMaintenance();
    Optional<Facility> get(String code);
}