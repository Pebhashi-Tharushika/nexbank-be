package com.mbpt.nexbank.nexbank_be.service;

import com.mbpt.nexbank.nexbank_be.dto.LoanDTO;

import java.util.List;

public interface LoanService {
    public List<LoanDTO> getAllLoans();
    public void deleteLoanById(Integer loanId);
}
