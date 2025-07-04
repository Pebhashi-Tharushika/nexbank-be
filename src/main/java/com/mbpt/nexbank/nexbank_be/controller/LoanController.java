package com.mbpt.nexbank.nexbank_be.controller;

import com.mbpt.nexbank.nexbank_be.dto.LoanDTO;
import com.mbpt.nexbank.nexbank_be.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<LoanDTO>> getAllLoans() {
        return ResponseEntity.status(HttpStatus.OK).body(loanService.getAllLoans());
    }

    @DeleteMapping(value = "/{loanId}")
    public ResponseEntity<String> deleteAllLoans(@PathVariable("loanId") Integer loanId) {
        loanService.deleteLoanById(loanId);
        return ResponseEntity.status(HttpStatus.OK).body("Loan deleted successfully");
    }
}
