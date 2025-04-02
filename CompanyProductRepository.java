package com.springboot.springbootapp.companyProduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyProductRepository extends JpaRepository<CompanyProduct,Long>{
	
	
}