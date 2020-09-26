import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IPadTest {

	@Test
	void testGetScreensize() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		assertEquals(ipad0.getScreensize(), 6.5);
	}

	@Test
	void testSetScreensize() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ipad0.setScreensize(1.2);
		assertEquals(ipad0.getScreensize(), 1.2);
	}

	@Test
	void testGetProcessor() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		assertEquals(ipad0.getProcessor(), "A10");
	}

	@Test
	void testSetProcessor() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ipad0.setProcessor("A12");
		assertEquals(ipad0.getProcessor(), "A12");
	}

	@Test
	void testIsHas4G() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		assertEquals(ipad0.isHas4G(), false);
	}

	@Test
	void testSetHas4G() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ipad0.setHas4G(true);
		assertEquals(ipad0.isHas4G(), true);
	}

	@Test
	void testGetMemory() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		assertEquals(ipad0.getMemory(), "8GB");
	}

	@Test
	void testSetMemory() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		ipad0.setMemory("16GB");
		assertEquals(ipad0.getMemory(), "16GB");
	}

	@Test
	void testReadString() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = IPad.read("IPAD 1, 6.5, A10, FALSE, BLACK, 8GB, 900");
		assertEquals(ipad0, ipad1);
	}

	@Test
	void testToString() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		System.out.println(ipad0.toString());
		assertEquals(ipad0.toString(),
				"Apple iPad 1 with 8GB of meomory\nwith an A10 processor and 6.5 inch screen\nhaving WiFi Technology\n900euro\n");
	}

	@Test
	void equalsSameObject() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = ipad0;
		assertEquals(ipad0, ipad1);
	}

	@Test
	void equalsDifferentObject() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		assertEquals(ipad0, ipad1);
	}

	/*
	 * @Test void notEqualsDifferentName() { IPad ipad0 = new IPad("IPAD 1", 900,
	 * "BLACK", 6.5, "A10", false, "8GB"); IPad ipad1 = new IPad("IPAD 1", 900,
	 * "BLACK", 6.5, "A10", false, "8GB"); assertEquals(ipad0, ipad1); }
	 */

	@Test
	void notEqualsDifferentName() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 2", 900, "BLACK", 6.5, "A10", false, "8GB");
		assertNotEquals(ipad0, ipad1);
	}

	@Test
	void notEqualsDifferentPrice() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 1", 1000, "BLACK", 6.5, "A10", false, "8GB");
		assertNotEquals(ipad0, ipad1);
	}

	@Test
	void notEqualsDifferentColor() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 1", 900, "WHITE", 6.5, "A10", false, "8GB");
		assertNotEquals(ipad0, ipad1);
	}

	@Test
	void notEqualsDifferentScreensize() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 1", 900, "BLACK", 4.5, "A10", false, "8GB");
		assertNotEquals(ipad0, ipad1);
	}

	@Test
	void notEqualsDifferentProcessor() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A12", false, "8GB");
		assertNotEquals(ipad0, ipad1);
	}

	@Test
	void notEqualsDifferent4G() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", true, "8GB");
		assertNotEquals(ipad0, ipad1);
	}

	@Test
	void notEqualsDifferentMemory() {
		IPad ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		IPad ipad1 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "16GB");
		assertNotEquals(ipad0, ipad1);
	}

	@Test
	void fileFormat() {
		Product ipad0 = new IPad("IPAD 1", 900, "BLACK", 6.5, "A10", false, "8GB");
		assertEquals(ipad0, "IPAD 1, 6.5, A10, FALSE, BLACK, 8GB, 900");
	}
}
