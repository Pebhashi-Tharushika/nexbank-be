package com.mbpt.nexbank.nexbank_be.service.impl;

import com.mbpt.nexbank.nexbank_be.dto.LoanDTO;
import com.mbpt.nexbank.nexbank_be.entity.LoanEntity;
import com.mbpt.nexbank.nexbank_be.repository.LoanRepository;
import com.mbpt.nexbank.nexbank_be.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public List<LoanDTO> getAllLoans() {
        List<LoanEntity> loanEntityList = loanRepository.findAll();
        return loanEntityList.stream()
                .map(
                        entity -> new LoanDTO(entity.getLoanId(), entity.getLoanType(), entity.getLoanAmount())
                ).collect(Collectors.toList());
    }
}
