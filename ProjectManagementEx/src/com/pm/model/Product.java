package com.pm.model;

public class Product {

	int prodid;
	String prodname;
	int prodprice;

	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", prodprice=" + prodprice + "]";
	}

	public Product(int prodid, String prodname, int prodprice) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public int getProdprice() {
		return prodprice;
	}

	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}

}
