package com.mbpt.nexbank.nexbank_be.service;

import com.mbpt.nexbank.nexbank_be.dto.LoanDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoanService {
    public List<LoanDTO> getAllLoans();
}
