package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name="CC_Person")
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany
    private Set<CreditCard> creditCards;
}
