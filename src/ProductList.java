import java.io.*;
import java.util.*;

/**
 * Class that contains a list of Products.
 * 
 * @author ricar
 *
 */
public class ProductList {
	private List<Product> productList;

	/**
	 * Constructor for the class ProductList
	 */
	public ProductList() {
		productList = new ArrayList<Product>();
	}

	/**
	 * @return the productList
	 */
	public List<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ProductList)) {
			return false;
		}
		ProductList other = (ProductList) obj;
		if (productList == null) {
			if (other.productList != null) {
				return false;
			}
		} else if (!productList.equals(other.productList)) {
			return false;
		}
		return true;
	}

	/**
	 * Adds a product to productList
	 * 
	 * @param productToAdd product to add
	 */
	public synchronized void add(Product productToAdd) {
		productList.add(productToAdd);
	}

	/**
	 * Reads in from a file
	 * 
	 * @param fileName file to read in from
	 * @return a ProductList with all products from a file in it
	 * @throws FileNotFoundException if file is not found
	 */
	public static ProductList read(String fileName) throws FileNotFoundException {
		ProductList res = new ProductList();
		Scanner sc = new Scanner(new File(fileName));

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			res.add(Product.read(line));
		}

		sc.close();
		return res;
	}

	/**
	 * Writes the productList to file in a correctly formatted way
	 * 
	 * @param fileName file to read to
	 * @throws IOException if file doesn't exist
	 */
	public void write(String fileName) throws IOException {
		Writer wr = new BufferedWriter(new FileWriter(fileName));
		for (int i = 0; i != productList.size(); i++) {
			wr.write(productList.get(i).fileFormated() + "\n");
		}
		wr.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String res = "";

		for (int i = 0; i != productList.size(); i++) {
			res += productList.get(i).toString();
		}

		return res;
	}

	public static synchronized void sort(ProductList productList, Comparator<Product> comparator) {
		Collections.sort(productList.productList, comparator);
	}
}
