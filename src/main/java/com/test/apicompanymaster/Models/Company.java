package com.test.apicompanymaster.Models;

import com.test.apicompanymaster.configurations.security.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "company")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date createAt;
    @OneToMany
    private Customer customer;


public String getDate(){
    return createAt != null ? Constants.format.format(createAt) : "";
}

}
