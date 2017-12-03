package training;

/**
 * Testclass for learn Junit
 * Created by Viacheslav Skryl on 05.11.2017
 */

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestTaskJunit {
	private static TaskJunit x;
	
	@Rule
	public final ExpectedException exp = ExpectedException.none();
	
	@Rule
	public Timeout time = new Timeout(1000);
	
	@BeforeClass
	public static void runTest() {
		x = new TaskJunit();
	}
	
	@Test
	public void testAdd() {
		double res = x.add(3, 4);
		if (res != 7.0) Assert.fail();
	}
	
	@Test
	public void testDeduct() {
		double res = x.deduct(5, 4);
		Assert.assertTrue(res == 1);
	}
	
	@Test
	public void testMult() {
		double res = x.mult(3, 2);
		Assert.assertEquals(res, 6.0, 1e-10);
	}
	
	@Ignore
	@Test
	public void testDiv() {
		double res = x.div(18, 6);
		if (res != 3.0) Assert.fail();;
	}
	
	@Test
	public void testDivException() {
		exp.expect(ArithmeticException.class);
		x.div(10.0, 0.0);
	}
	
	@Test
	public void testObject() {
		Assert.assertNotNull(x);
	}
	
	@Test
	public void testTimeout() {
		while(true) { }
	}

}
