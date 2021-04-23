package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Calc;
public class t {

	@Test
	public void testDivide() {
		assertEquals(5,Calc.divide(10, 2));
	}
	@Test
	public void testMultiply() {
		assertEquals(20,Calc.multiply(10, 2));
	}
	@Test
	public void testSubtract() {
		assertEquals(8,Calc.subtract(10, 2));
	}
}
