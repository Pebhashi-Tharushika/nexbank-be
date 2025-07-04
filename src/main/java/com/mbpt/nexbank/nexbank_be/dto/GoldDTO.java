package com.mbpt.nexbank.nexbank_be.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoldDTO {
    private Integer goldId;
    private Integer weight;
    private Double price;
}
