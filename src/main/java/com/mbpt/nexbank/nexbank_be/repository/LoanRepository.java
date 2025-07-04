package com.mbpt.nexbank.nexbank_be.repository;

import com.mbpt.nexbank.nexbank_be.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Integer> {
}
