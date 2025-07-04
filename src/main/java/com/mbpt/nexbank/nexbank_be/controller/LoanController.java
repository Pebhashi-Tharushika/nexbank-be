package com.mbpt.nexbank.nexbank_be.controller;

import com.mbpt.nexbank.nexbank_be.dto.LoanDTO;
import com.mbpt.nexbank.nexbank_be.security.Constants;
import com.mbpt.nexbank.nexbank_be.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping(value = "/getAllLoans")
    @PreAuthorize("hasAuthority('" + Constants.LOAN_GET_ALL + "')")
    public ResponseEntity<List<LoanDTO>> getAllLoans() {
        return ResponseEntity.status(HttpStatus.OK).body(loanService.getAllLoans());
    }

    @DeleteMapping(value = "/{loanId}")
    @PreAuthorize("hasAuthority('" + Constants.LOAN_DELETE + "')")
    public ResponseEntity<String> deleteAllLoans(@PathVariable("loanId") Integer loanId) {
        loanService.deleteLoanById(loanId);
        return ResponseEntity.status(HttpStatus.OK).body("Loan deleted successfully");
    }
}
