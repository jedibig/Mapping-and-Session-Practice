package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "STORE_PRODUCT")
public class Product {
    @Id
    private long sku;
    private String name;
    @ManyToMany
    private List<Store> stores;
}
