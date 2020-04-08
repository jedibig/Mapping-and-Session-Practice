package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Person {
    @Id @GeneratedValue
    private long id;
    private String name;
    @OneToOne
    private Passport passport;
}
