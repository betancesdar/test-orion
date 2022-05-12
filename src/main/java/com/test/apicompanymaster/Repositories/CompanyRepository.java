package com.test.apicompanymaster.Repositories;

import com.test.apicompanymaster.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {


}
