package com.mbpt.nexbank.nexbank_be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Integer accountNumber;
    private String name;
    private String branch;
    private double balance;
}
