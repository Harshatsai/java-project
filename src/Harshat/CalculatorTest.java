package Harshat;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
         Calculator cal=new Calculator();
	@Test
	public void testAddition() {
		assertEquals(15,cal.addition(5,10));
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(-5,cal.subtraction(5,10));
	}

	@Test
	public void testMultiplication() {
		assertEquals(50,cal.multiplication(5,10));
	}

	@Test
	public void testDivision() {
		assertEquals(2,cal.division(10,5));
	}
	@BeforeClass
	public static void dummy()
	{
		System.out.println("Before class");
	}
	@After
	public void dummy1()
	{
		System.out.println("Afer");
	}
	@Before
	public void dummy2()
	{
		System.out.println("Before");
	}
	@AfterClass
	public static void dummy3()
	{
		System.out.println("Afterclass");
	}
	@Ignore
	public static void dummy4()
	{
		System.out.println("Ignore");
	}

}
