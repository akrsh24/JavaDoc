package sapient.gm;


import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.*;
import java.util.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import sapient.gm.com.customer.*;
import sapient.gm.com.shop.repo.*;
import sapient.gm.com.shop.product.*;


public class ShopSpec {
	
	private CountCheck counter = new CountCheck();

	RepositoryImpl repository;
	Customer customer;

	
	@BeforeEach
	public void setUp() throws FileNotFoundException, IOException {
		Repository rep = new RepositoryImpl();
		customer = new Customer(rep);

		rep.mapperData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Number customers: ");
		int num = sc.nextInt();
		counter.initialize(num);

	}
	
    @Test
	public void testProduct() {
		boolean b = customer.buyProduct(1001, 60);
		assertEquals(false, b);
		boolean c = customer.buyProduct(1001, 50);
		assertEquals(true, c);
		
		counter.addOne();
		
	}
	
	@AfterEach
	public void tearDown() {
		repository = null;
		customer = null;
		
		System.out.println("Number of threads running: " + counter.getCount());
		
	}
		
}


