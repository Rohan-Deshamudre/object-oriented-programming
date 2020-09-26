import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductTest {

//Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);

	@Test
	void testGetName() {
		Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.getName(), "IPHONE 6");
	}

	@Test
	void testSetName() {
		Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setName("IPHONE 200");
		assertEquals(iphone0.getName(), "IPHONE 200");
	}

	@Test
	void testGetPrice() {
		Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.getPrice(), 900);
	}

	@Test
	void testSetPrice() {
		Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setPrice(1000);
		assertEquals(iphone0.getPrice(), 1000);
	}

	@Test
	void testGetColor() {
		Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.getColor(), "BLACK");
	}

	@Test
	void testSetColor() {
		Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setColor("WHITE");
		assertEquals(iphone0.getColor(), "WHITE");
	}

	@Test
	void testReadIPhone() {
		Product iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		Product iphone1 = Product.read("IPHONE 6, 5.4, A10, CDMA, BLACK, 8GB, FALSE, 900");
		assertEquals(iphone0, iphone1);
	}

	@Test
	void testReadIPad() {
		Product ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		Product ipad1 = Product.read("IPAD 1, 6.5, A10, FALSE, BLACK, 8GB, 900");
		assertEquals(ipad0, ipad1);
	}

	@Test
	void notEqualsDifferentMemory() {
		Product ipad0 = new IPad("HELLO", 900, "BLACK", 6.5, "A10", false, "8GB");
		Product iphone0 = new IPhone("HELLO", 900, "BLACK", 6.5, "A10", false, "8GB", false);
		assertNotEquals(ipad0, iphone0);
	}

}
