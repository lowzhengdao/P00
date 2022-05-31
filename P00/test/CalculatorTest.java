import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {		
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public void testMultiple() {		
		int a = 5;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 30;
		assertEquals(actual, expected);

	}
	@Test
	public void testDivide() {		
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 5;
		assertEquals(actual, expected);

	
	}
	@Test
	public void NormalTestCase() {		
		int a = 5;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 11;
		assertEquals(actual, expected);
	}
	@Test
	public void BoundaryTestCase() {		
		int a = 0;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals(actual, expected);

	}	
	@Test
	public void NormalTestCaseNegative() {		
		int a = -10;
		int b = -12;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = -22;
		assertEquals(actual, expected);
	}
	@Test
	public void ErrorTestCase() {		
		int a = 1000; 
		int b = -12;
		
		Calculator cal = new Calculator();
				
		int actual = cal.add(a, b);
		
		int expected = -22; // Wrong expected value, resulting in error
		assertEquals(actual, expected);
	}
}
