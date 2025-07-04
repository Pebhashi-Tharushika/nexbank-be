package com.mbpt.nexbank.nexbank_be.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_number")
    private Integer accountNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "branch")
    private String branch;
    @Column(name = "balance")
    private double balance;
}
