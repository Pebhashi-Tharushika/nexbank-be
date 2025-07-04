package com.mbpt.nexbank.nexbank_be.service.impl;

import com.mbpt.nexbank.nexbank_be.dto.GoldDTO;
import com.mbpt.nexbank.nexbank_be.entity.GoldEntity;
import com.mbpt.nexbank.nexbank_be.repository.GoldRepository;
import com.mbpt.nexbank.nexbank_be.service.GoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoldServiceImpl implements GoldService {

    @Autowired
    private GoldRepository goldRepository;

    @Override
    public List<GoldDTO> getAllGold() {
        List<GoldEntity> goldEntities = goldRepository.findAll();
        return goldEntities.stream()
                .map(entity -> new GoldDTO(entity.getGoldId(), entity.getWeight(), entity.getPrice()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteGoldById(Integer goldId) {
        goldRepository.deleteById(goldId);
    }
}
