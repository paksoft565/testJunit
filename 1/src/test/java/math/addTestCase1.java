package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTestCase1 {

	@Test
	public void testAdd() {
		MyMathTest addition = new MyMathTest();
		int actual = addition.myadd(10, 35);
		int expected = 45;
		assertEquals(expected,actual);
	}

}
