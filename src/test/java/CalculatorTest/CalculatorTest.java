package CalculatorTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Calculator.Calculator;

public class CalculatorTest {
	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		Assert.assertEquals(calc.add(10, 5), 15);
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(calc.divide(10, 2), 5.0);
	}
//	xin chào
}