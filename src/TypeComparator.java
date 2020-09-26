import java.util.Comparator;

public class TypeComparator implements Comparator<Product> {

	@Override
	public int compare(Product a, Product b) {
		return a.getName().compareTo(b.getName());
	}

}
