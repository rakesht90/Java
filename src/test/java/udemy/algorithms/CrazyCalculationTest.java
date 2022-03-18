package udemy.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CrazyCalculationTest {

	CrazyCalculation c;
	
	@Before
	public void setup() {
		c = new CrazyCalculation();	
	}
	
	@Test
	public void calculateValid() {
		int result = c.calculate(2);
		Assert.assertEquals(6, result);
		Assert.assertTrue(result == 6);
	}
	
}
