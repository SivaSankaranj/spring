package com.springboot.springbootapp.companyProduct;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyProductService {
	
	@Autowired
	CompanyProductRepository companyRepository;
	

	public CompanyProduct saveProduct(CompanyProduct companyProduct) {
		
           companyRepository.save(companyProduct);
           return companyProduct;
	}
	
	public List<CompanyProduct> findallproducts(){
		
		return companyRepository.findAll();		
	}
	
	public CompanyProduct findproduct(Long id) {
		
		return companyRepository.findById(id).get();
	}
	
	public CompanyProduct updateProduct(CompanyProduct companyProduct, Long id) {
		
		CompanyProduct fetchedProduct = null;
		Optional<CompanyProduct> fetchedProductOptional = companyRepository.findById(id);
		
		if(fetchedProductOptional.isPresent()) {
			fetchedProduct = fetchedProductOptional.get();
			fetchedProduct.setConsumerCategory(companyProduct.getConsumerCategory());
			fetchedProduct.setCount(companyProduct.getCount());
			fetchedProduct.setGender(companyProduct.getGender());
			fetchedProduct.setImageurl(companyProduct.getImageurl());
			fetchedProduct.setProductCategory(companyProduct.getProductCategory());
			fetchedProduct.setRemarks(companyProduct.getRemarks());
			companyRepository.save(fetchedProduct);

		}else {
			fetchedProduct = null;
		}
		
		
		return fetchedProduct;
	}
	
	
}
