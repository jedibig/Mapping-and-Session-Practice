package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CreditCard {
    @Id @Column(name="ccNumber")
    private String number;
    private String issuer;
}
