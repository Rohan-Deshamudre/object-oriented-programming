import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class ProductListTest {

	@Test
	void testGetProductList() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		List<Product> java = new ArrayList<Product>();
		java.add(iphone0);
		java.add(ipad0);
		ProductList own = new ProductList();
		own.add(iphone0);
		own.add(ipad0);

		assertEquals(own.getProductList(), java);
	}

	@Test
	void testSetProductList() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		List<Product> java = new ArrayList<Product>();
		java.add(iphone0);
		java.add(ipad0);
		ProductList own = new ProductList();
		own.setProductList(java);

		assertEquals(own.getProductList(), java);
	}

	// Read can't be tested, since it uses a filename. You can test it by running
	// Product.java.

	@Test
	void testToString() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ProductList pl0 = new ProductList();
		pl0.add(iphone0);
		pl0.add(ipad0);

		assertEquals(pl0.toString(),
				"Apple iPhone 6 with 8GB of meomory\nwith an A10 processor and 5.4 inch screen\n900euro\nApple iPad 1 with 8GB of meomory\nwith an A10 processor and 6.5 inch screen\nhaving WiFi Technology\n900euro\n");
	}

	@Test
	void equalsSameObject() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ProductList pl0 = new ProductList();
		pl0.add(iphone0);
		pl0.add(ipad0);
		ProductList pl1 = pl0;

		assertEquals(pl0, pl1);
	}

	@Test
	void equalsDifferentObject() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ProductList pl0 = new ProductList();
		pl0.add(iphone0);
		pl0.add(ipad0);
		ProductList pl1 = new ProductList();
		pl1.add(iphone0);
		pl1.add(ipad0);

		assertEquals(pl0, pl1);
	}

	@Test
	void notEqualsDifferentLength() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ProductList pl0 = new ProductList();
		pl0.add(iphone0);
		pl0.add(ipad0);
		ProductList pl1 = new ProductList();
		pl1.add(iphone0);

		assertNotEquals(pl0, pl1);
	}

	@Test
	void notEqualsDifferentOrder() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ProductList pl0 = new ProductList();
		pl0.add(iphone0);
		pl0.add(ipad0);
		ProductList pl1 = new ProductList();
		pl1.add(ipad0);
		pl1.add(iphone0);

		assertNotEquals(pl0, pl1);
	}

	@Test
	void notEqualsDifferentName() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 8", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ProductList pl0 = new ProductList();
		pl0.add(iphone0);
		pl0.add(ipad0);
		ProductList pl1 = new ProductList();
		pl1.add(iphone1);
		pl1.add(ipad0);

		assertNotEquals(pl0, pl1);
	}

}
