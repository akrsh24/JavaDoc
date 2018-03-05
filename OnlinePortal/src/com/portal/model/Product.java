package com.portal.model;

public class Product {

	private String productCode;
	private String name;
	private String brand;
	private String price;
	private String stock;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public Product(String productCode, String name, String brand, String price, String stock) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", brand=" + brand + ", price=" + price
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
	
}
