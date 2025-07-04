package com.mbpt.nexbank.nexbank_be.controller;

import com.mbpt.nexbank.nexbank_be.dto.GoldDTO;
import com.mbpt.nexbank.nexbank_be.security.Constants;
import com.mbpt.nexbank.nexbank_be.service.GoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gold")
public class GoldController {
    @Autowired
    private GoldService goldService;

    @GetMapping(value = "/getAllGold")
    @PreAuthorize("hasAuthority('" + Constants.GOLD_GET_ALL + "')")
    public ResponseEntity<List<GoldDTO>> getAllGold() {
        return ResponseEntity.status(HttpStatus.OK).body(goldService.getAllGold());
    }

    @DeleteMapping(value = "/{goldStockId}")
    @PreAuthorize("hasAuthority('" + Constants.GOLD_DELETE + "')")
    public ResponseEntity<String> deleteGoldRecord(@PathVariable("goldStockId") Integer goldStockId) {
        goldService.deleteGoldById(goldStockId);
        return ResponseEntity.status(HttpStatus.OK).body("Gold stock deleted successfully");
    }
}
