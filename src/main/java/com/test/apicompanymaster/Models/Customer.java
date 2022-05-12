package com.test.apicompanymaster.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(fetch = FetchType.EAGER)
    private Company company;
    @OneToMany
    private List<Address> addresses;

}
