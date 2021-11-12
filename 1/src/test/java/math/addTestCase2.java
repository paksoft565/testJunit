package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTestCase2 {

	@Test
	public void testAdd() {
		MyMathTest addition = new MyMathTest();
		int actual = addition.myadd(15, 85);
		int expected = 100;
		assertEquals(expected,actual);
	}

}
