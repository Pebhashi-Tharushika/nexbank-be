package com.mbpt.nexbank.nexbank_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gold")
public class GoldEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gold_id")
    private Integer goldId;

    @Column(name = "weight")
    private int weight;

    @Column(name = "price")
    private Double price;
}
