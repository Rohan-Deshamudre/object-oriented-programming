import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product a, Product b) {
		return a.getPrice() < b.getPrice() ? -1 : a.getPrice() == b.getPrice() ? 0 : 1;		
		/*
		 * If you're as confused as I was when I first saw this, this just means the
		 * following:
		 * 
		 * if (a.getPrice() < b.getPrice()) { 
		 * 		return -1; 
		 * } else if (a.getPrice() == b.getPrice()) { 
		 * 		return 0; 
		 * } else { 
		 * 		return 1; 
		 * }
		 */
	}

}
