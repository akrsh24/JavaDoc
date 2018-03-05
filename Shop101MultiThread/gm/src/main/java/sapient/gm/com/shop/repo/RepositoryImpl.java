package sapient.gm.com.shop.repo;

import java.util.*;
import java.io.*;

import sapient.gm.com.shop.product.*;

public class RepositoryImpl implements Repository {

	Map<Integer, Product> map = new HashMap<Integer, Product>();
	String heading, st;

	public void mapperData() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\Biswarup Chakrabarty\\Desktop\\Data.txt");
        BufferedReader br = new BufferedReader(fr);
        String[] str = new String[5];
		
		heading = br.readLine();
		while ((st = br.readLine()) != null) {
			str = st.split(",");
			Product product = new Product();

			product.setId(Integer.parseInt(str[0]));
			product.setProduct(str[1]);
			product.setBrand(str[2]);
			product.setPrice(Integer.parseInt(str[3]));
			product.setQuantity(Integer.parseInt(str[4]));

			map.put(Integer.parseInt(str[0]), product);

		}

	}

	public Map<Integer, Product> map() {
		return map;
	}

	public String getProductName() {
		// TODO Auto-generated method stub
		return heading;
	}

}
