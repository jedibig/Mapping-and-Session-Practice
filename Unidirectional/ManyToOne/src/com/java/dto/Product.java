package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Product {
    @Id
    private long sku;
    private String name;
    @ManyToOne
    private Brand brand;
}
