package com.portal.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository implements PortalImpl {

	private static  ArrayList<Product> list = new ArrayList<>();
	public static void main(String[] args) {
		
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Product Name");
		name=sc.nextLine();
		
		

		String csvFile = "C:\\Users\\akasriva2\\Desktop\\ProductRepo.csv";
		String line = "";
		String cvsSplitBy = ",";

		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] repo = line.split(cvsSplitBy);

				Product product = new Product(repo[0], repo[1], repo[2], repo[3], repo[4]);

				boolean check=checkProd(name);
//				if (repo[1].equals("Pendrive")) {
//					list.add(product);
//				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean checkProd(String name) {
		if(list.contains(name)){
			return true;
		}
		else
			return false;
		
	}

}