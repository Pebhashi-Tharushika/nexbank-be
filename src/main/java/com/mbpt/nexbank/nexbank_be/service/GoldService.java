package com.mbpt.nexbank.nexbank_be.service;

import com.mbpt.nexbank.nexbank_be.dto.GoldDTO;

import java.util.List;

public interface GoldService {

    public List<GoldDTO> getAllGold();

    public void deleteGoldById(Integer goldId);
}
