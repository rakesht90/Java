package udemy.algorithms.euclid;

import org.junit.Assert;
import org.junit.Test;

public class EuclidTest {

	@Test
	public void gcdTest() {
		Euclid e = new Euclid();
		Assert.assertEquals(2, e.gcd(22, 6));
	}
}
