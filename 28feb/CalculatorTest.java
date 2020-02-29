package com.cts.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.calculator.Calculator;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void init() {
		calculator = new Calculator();
		System.out.println("Object created!!!!");
	}

	@AfterClass
	public static void destroy() {
		calculator = null;
		System.out.println("Object destroyed ");
	}
@Ignore
	@Test
	public void test_add_success() {
		assertEquals(17, calculator.add(12, 5));
		System.out.println("inside add test ");
	}
  @Ignore
	@Test
	public void test_sub_success() {
		assertEquals(7, calculator.sub(5, 12));
		System.out.println("Inside sub test");
	}
	@Ignore
	
	@Test
	public void test_divide_success()
	{
		assertEquals(2, calculator.divide(10, 5));
		System.out.println("inside divide test");
	}
	@Ignore
	@Test
	public void test_multiply_success()
	{
		assertEquals(24, calculator.multiply(6, 4));
		System.out.println("inside multiply test");
	}
	@Test
	public void test_isprime_success()
	{
		assertEquals(false, calculator.isPrime(4));
		System.out.println("Prime number");
	}
}
