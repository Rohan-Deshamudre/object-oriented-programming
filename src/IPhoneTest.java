import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IPhoneTest {

	@Test
	void testGetScreensize() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.getScreensize(), 5.4);
	}

	@Test
	void testSetScreensize() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setScreensize(1.2);
		assertEquals(iphone0.getScreensize(), 1.2);
	}

	@Test
	void testGetProcessor() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.getProcessor(), "A10");
	}

	@Test
	void testSetProcessor() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setProcessor("A11");
		assertEquals(iphone0.getProcessor(), "A11");
	}

	@Test
	void testIsGSM() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.isGSM(), false);
	}

	@Test
	void testSetGSM() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setGSM(true);
		assertEquals(iphone0.isGSM(), true);
	}

	@Test
	void testGetMemory() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.getMemory(), "8GB");
	}

	@Test
	void testSetMemory() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setMemory("16GB");
		assertEquals(iphone0.getMemory(), "16GB");
	}

	@Test
	void testIsHas3DTouch() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0.isHas3DTouch(), false);
	}

	@Test
	void testSetHas3DTouch() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		iphone0.setHas3DTouch(true);
		assertEquals(iphone0.isHas3DTouch(), true);
	}

	@Test
	void testReadString() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = IPhone.read("IPHONE 6, 5.4, A10, CDMA, BLACK, 8GB, FALSE, 900");
		assertEquals(iphone0, iphone1);
	}

	@Test
	void testToString() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		System.out.println(iphone0.toString());
		assertEquals(iphone0.toString(),
				"Apple iPhone 6 with 8GB of meomory\nwith an A10 processor and 5.4 inch screen\n900euro\n");
	}

	@Test
	void equalsSameObject() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = iphone0;
		assertEquals(iphone0, iphone1);
	}

	@Test
	void equalsDifferentObject() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferentName() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 5", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferentPrice() {
		IPhone iphone0 = new IPhone("IPHONE 6", 100, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferentColor() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "WHITE", 5.4, "A10", false, "8GB", false);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferentScreensize() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 1.3, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferentProcessor() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A12", false, "8GB", false);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferentModem() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", true, "8GB", false);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferentMemory() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "16GB", false);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void notEqualsDifferent3D() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		IPhone iphone1 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", true);
		assertNotEquals(iphone0, iphone1);
	}

	@Test
	void fileFormat() {
		IPhone iphone0 = new IPhone("IPHONE 6", 900, "BLACK", 5.4, "A10", false, "8GB", false);
		assertEquals(iphone0, "IPHONE 6, 5.4, A10, CDMA, BLACK, 8GB, FALSE, 900");
	}

}
