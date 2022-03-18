package udemy.algorithms.linearsearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinearSearchTest {

	LinearSearch l;
	
	@Before
	public void init() {
		l = new LinearSearch();
	}
	
	@Test
	public void searchSuccess() {
		int[] array = {5,3,1,8,9,12,34,55};
		Assert.assertEquals(0, l.search(5, array));
		Assert.assertEquals(4, l.search(9, array));
		Assert.assertEquals(7, l.search(55, array));
	}
	
	@Test
	public void searchNotFound() {
		int[] array = {3, 4, 5};
		Assert.assertEquals(-1, l.search(90, array));
	}
}
