package com.project.gts.project.controllers;

import org.springframework.web.bind.annotation.*;
import com.project.gts.project.dto.EmploymentAgreementDTO;
import com.project.gts.project.services.EmploymentAgreementService;

import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/api/employment-agreements")
public class EmploymentAgreementController {

    private final EmploymentAgreementService employmentAgreementService;

    public EmploymentAgreementController(EmploymentAgreementService employmentAgreementService) {
        this.employmentAgreementService = employmentAgreementService;
    }

    @Operation(summary = "Creating EmploymentAgreement", description = "new employee agreement")
    @PostMapping
    public EmploymentAgreementDTO createEmploymentAgreement(@RequestBody EmploymentAgreementDTO employmentAgreementDTO) {
        return employmentAgreementService.createEmploymentAgreement(employmentAgreementDTO);
    }

    @Operation(summary = "Get EmploymentAgreement", description = "retrieve an employment agreement")
    @GetMapping("/{id}")
    public EmploymentAgreementDTO getEmploymentAgreementById(@PathVariable Long id) {
        return employmentAgreementService.getEmploymentAgreementById(id);
    }

    @Operation(summary = "Update EmploymentAgreement", description = "update an existing employment agreement")
    @PutMapping("/{id}")
    public EmploymentAgreementDTO updateEmploymentAgreement(@PathVariable Long id, @RequestBody EmploymentAgreementDTO employmentAgreementDTO) {
        return employmentAgreementService.updateEmploymentAgreement(id, employmentAgreementDTO);
    }

    @Operation(summary = "Delete EmploymentAgreement", description = "delete an employment agreement")
    @DeleteMapping("/{id}")
    public String deleteEmploymentAgreement(@PathVariable Long id) {
        employmentAgreementService.deleteEmploymentAgreement(id);
        return "Employment agreement deleted successfully.";
    }


    @GetMapping
    public List<EmploymentAgreementDTO> listEmploymentAgreements() {
        return employmentAgreementService.listEmploymentAgreements();
    }

    @Operation(summary = "Search Employment Agreements", description = "Search employment agreements based on multiple criteria")
    // @GetMapping("/search")
    // public List<EmploymentAgreementDTO> searchEmploymentAgreements(
    //         @RequestParam(required = false) String employeeName,
    //         @RequestParam(required = false) String role) 
    //     {
        
    //     return employmentAgreementService.searchEmploymentAgreements(employeeName, role);
    // }
    @GetMapping("/search")
    public List<EmploymentAgreementDTO> searchEmploymentAgreements(@RequestParam(required = false) String employeeName,
                                            @RequestParam(required = false) String role) {
        return employmentAgreementService.searchEmploymentAgreements(employeeName, role);
    }
}
