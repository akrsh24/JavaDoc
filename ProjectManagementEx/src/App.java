import com.pm.model.*;
import com.pm.prodrepo.Repo;

public class App {

	public static void main(String[] args) {
		Repo repo = new Repo();

		Product product = new Product(100, "A", 1000);
		Product product1 = new Product(101, "B", 2000);
		Product product2 = new Product(102, "C", 3000);
		Product product3 = new Product(103, "D", 4000);

		// -------------------------------------------------------------------------------------------------

		// do {
		// System.out.println("-------------------Product Management
		// System-----------------------------------");
		// System.out.println("1.Add Product");
		// System.out.println("2.Show Product By ID");
		// System.out.println("3.Update");
		// System.out.println("4.Remove");
		// System.out.println("5.View All");
		// System.out.println("6.SortBy Product Name");
		// System.out.println("7.SortBy Product Price");
		// System.out.println("Enter your choice");
		//

		repo.add(product);
		repo.add(product1);
		repo.add(product2);
		repo.add(product3);

		repo.get(102);
		repo.update(101, 2500);
		repo.remove1(100);
		repo.viewAll().forEach(item->{
			System.out.println(item);
		});

	}
}
