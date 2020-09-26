import java.util.Comparator;

public class Sort extends Thread {
	private ProductList productList;
	private Comparator<Product> comparator;

	public Sort(ProductList productList, Comparator<Product> comparator) {
		this.productList = productList;
		this.comparator = comparator;
	}

	public void run() {
		ProductList.sort(productList, comparator);
		System.out.println(productList);
	}

}
