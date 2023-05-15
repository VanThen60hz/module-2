package m2_case_study.FuramaManager.controller;

import m2_case_study.FuramaManager.model.Contract;
import m2_case_study.FuramaManager.service.ContractService;
import m2_case_study.FuramaManager.service.ContractServiceImpl;

import java.util.List;

public class ContractController {
    private ContractService contractService = new ContractServiceImpl();

    public void create(Contract contract) {
        contractService.create(contract);
    }

    public void update(Contract contract) {
        contractService.update(contract);
    }

    public List<Contract> findAll(){
        return contractService.findAll();
    }
}