package com.mbpt.nexbank.nexbank_be.repository;

import com.mbpt.nexbank.nexbank_be.entity.GoldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRepository extends JpaRepository<GoldEntity, Integer> {
}
