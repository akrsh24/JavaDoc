package com.pm.prodrepo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.pm.model.Product;

public class Repo implements ProductRepoImpl {

	List<Product> prodSet = new ArrayList<Product>();

	@Override
	public void add(Product product) {
		prodSet.add(product);
	}

	@Override
	public Product get(int id) {
		Product prod1 = null;
		for (Product prod : prodSet) {
			if (id == prod.getProdid())
				prod1 = prod;
			break;

		}
		return prod1;
	}

	@Override
	public void update(int id, int price) {
		for (Product prod : prodSet) {
			if (id == prod.getProdid()) {
				prod.setProdprice(price);
			}
		}
	}

	@Override
	public void remove1(int id) {
//		for (Product prod : prodSet) {
//			if (id == prod.getProdid()) {
//				prodSet.remove(prod);
//			}
//		}
		Iterator<Product> iterator=prodSet.iterator();
		while(iterator.hasNext()) {
          Product product=(Product) iterator.next();
			if(id==product.getProdid()) {
				iterator.remove();
			}
		}
	}

	@Override
	public List<Product> viewAll() {
		return prodSet;
	}

	@Override
	public List<Product> sortBy(String prodname) {
		Comparator<Product> CompareProdName = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o1.getProdname().compareTo(o2.getProdname());
			}
		};
		
		Comparator<Product> CompareProdPrice = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				if (o1.getProdprice() > o2.getProdprice())
					return 1;

				else if (o1.getProdname() == o2.getProdname())
					return 0;

				else
					return -1;
			}
		};

		if (prodname.equals("name")) {
			prodSet.sort(CompareProdName);
		}
		if (prodname.equals("price")) {
			prodSet.sort(CompareProdPrice);
		}
		return prodSet;

	}
}
