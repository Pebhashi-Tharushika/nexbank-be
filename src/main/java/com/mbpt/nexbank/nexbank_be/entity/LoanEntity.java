package com.mbpt.nexbank.nexbank_be.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "loans")
public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_id")
    private Integer loanId;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "loan_amount")
    private Double loanAmount;

}
