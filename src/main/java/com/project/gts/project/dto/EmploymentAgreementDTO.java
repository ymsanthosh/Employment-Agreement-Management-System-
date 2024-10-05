package com.project.gts.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentAgreementDTO {

    private Long id;
    private String employeeName;
    private String role;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long salary;
    private String terms;
    private OtherDetailsDTO otherDetails;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class OtherDetailsDTO {
        private String department;
        private String manager;
    }
}
