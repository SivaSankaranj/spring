package com.springboot.springbootapp.companyProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CompanyProductController {
	
	@Autowired
	CompanyProductService productService;
	
	@PostMapping("/company/product")
	public CompanyProduct saveProduct(@RequestBody CompanyProduct companyProduct ) {
		return productService.saveProduct(companyProduct);
		
	}
	@GetMapping("/company/products")
	public List<CompanyProduct> getAllProduct() {
		
		return productService.findallproducts();
		
	}
	@GetMapping("/company/product/{id}")
	public CompanyProduct getProduct(@PathVariable ("id") Long id) {
		 return  productService.findproduct(id);
		
	}
	
	@PutMapping("/company/product/{id}")
	public CompanyProduct updateProduct(@PathVariable ("id") Long id,@RequestBody CompanyProduct companyProduct ) {
		 return  productService.updateProduct(companyProduct,id);
		
	}
	

}
