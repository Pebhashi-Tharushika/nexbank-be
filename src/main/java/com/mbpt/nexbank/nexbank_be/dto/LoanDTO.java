package com.mbpt.nexbank.nexbank_be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDTO {
    private Integer loanId;
    private String loanType;
    private Double loanAmount;
}
