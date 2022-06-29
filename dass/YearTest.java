package dass;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class YearTest {
	private static Year year;
	@BeforeAll
	static void beforeAl( ) {
		year = new Year();
	}
	@Test
	void test1() {
		boolean actual = year.isYear(2000);
		boolean expacted = true;
		assertEquals(expacted, actual);
	}
	
	@Test
	void test2() {
		boolean actual = year.isYear(1900);
		boolean expacted = false;
		assertEquals(expacted, actual);
	}
	
	@Test
	void test3() {
		boolean actual = year.isYear(1904);
		boolean expacted = true;
		assertEquals(expacted, actual);
	}
	
	@Test
	void test4() {
		boolean actual = year.isYear(1616);
		boolean expacted = true;
		assertEquals(expacted, actual);
	}
	
	@Test
	void test5() {
		boolean actual = year.isYear(-1616);
		boolean expacted = false;
		assertEquals(expacted, actual);
	}
}
