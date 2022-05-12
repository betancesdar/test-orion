package com.test.apicompanymaster.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String idCountry;
    private String idState;
    private String idCity;
    @ManyToOne(cascade = {CascadeType.ALL,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private Customer customer;

}
