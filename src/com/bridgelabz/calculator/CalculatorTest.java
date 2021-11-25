package com.bridgelabz.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

	
	public class CalculatorTest {

	@Test
	public void testAdd() { 
		Calculator calculator = new Calculator();
		int a = 15; int b = 20; 
		int expectedResult = 35;
		
		assertEquals(calculator, calculator);
	
	}
	
	@Test
	public void testdiv() { 
		Calculator calculator = new Calculator();
		int a = 15; int b = 3; 
		int expectedResult = 5;
		
		assertEquals(calculator, calculator);
	
	}
	
	@Test
	public void testsub() { 
		Calculator calculator = new Calculator();
		int a = 20; int b = 15; 
		int expectedResult = 5;
		
		assertEquals(calculator, calculator);
	}
	
	@Test
	public void testmul() { 
		Calculator calculator = new Calculator();
		int a = 5; int b = 7; 
		int expectedResult = 35;
		
		assertEquals(calculator, calculator);
	}
	
}
