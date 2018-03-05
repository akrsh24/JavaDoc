package sapient.gm.com.shop.repo;

import java.io.*;
import java.util.*;

import sapient.gm.com.shop.product.*;

public interface Repository {

	public void mapperData() throws FileNotFoundException, IOException;

	public Map<Integer, Product> map();
	
	public String getProductName();

}
