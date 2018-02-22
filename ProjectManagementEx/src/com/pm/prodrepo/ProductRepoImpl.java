package com.pm.prodrepo;

import java.util.List;

import com.pm.model.*;

public interface ProductRepoImpl {

	void add(Product product);
	Product get(int id);
	void update(int id,int price);
	void remove1(int id);
	List<Product> viewAll();
	List<Product> sortBy(String prodname);
	
	
}
