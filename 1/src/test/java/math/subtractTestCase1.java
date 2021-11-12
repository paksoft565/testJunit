package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtractTestCase1 {

	@Test
	public void test() {
		MyMathTest subtract = new MyMathTest();
		int actual = subtract.mySubtract(10, 35);
		int expected = -25;
		assertEquals(expected,actual);
	}

}
