package com.springboot.springbootapp.companyProduct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class CompanyProduct {

     @Id
     @GeneratedValue
	public Long productId;
    String consumerCategory;
 	String productCategory;
 	String gender;
 	String remarks;
 	Integer count;
 	String imageurl;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getConsumerCategory() {
		return consumerCategory;
	}
	public void setConsumerCategory(String consumerCategory) {
		this.consumerCategory = consumerCategory;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
}
