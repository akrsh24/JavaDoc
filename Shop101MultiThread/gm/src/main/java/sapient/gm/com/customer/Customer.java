package sapient.gm.com.customer;

import java.util.*;
import java.io.*;
import sapient.gm.com.shop.repo.*;
import sapient.gm.com.shop.product.*;

public class Customer {
	
	Repository repo;
	Map<Integer, Product> map;
	private String st;
	Product p;
	
	public Customer(Repository repository) {
		// TODO Auto-generated constructor stub
		repo = repository;
		map = repo.map();
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}
	
	public void viewProduct(String name) {
		
		Set<Integer> key = map.keySet();
		
		for(Integer i : key) {
			p = map.get(i);
			if(p.getProduct().equals(name)) {
				System.out.println(p);
			}
		}
	}
	
	public void viewBrand(String name) {
		Set<Integer> key = map.keySet();
		
		for(Integer i : key) {
			p = map.get(i);
			if(p.getBrand().equals(name)) {
				System.out.println(p); 
				
			}
		}
		
	}
	public void viewAll() {
		Set<Integer> key = map.keySet();
		for(Integer i : key) {
			p = map.get(i);
			System.out.println(p);
		}
	}
	
	public boolean buyProduct(int id, int quantity) {
		Set<Integer> key = map.keySet();
		for(Integer i : key) {
			p = map.get(i);
			if(p.getId() == id && p.getQuantity()>= quantity) {
				p.setQuantity(p.getQuantity()-quantity);
				map.put(p.getId(), p);
				return true;
			}else
				return false;
			
			}
		return false;
	}

}
