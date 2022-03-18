package udemy.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchRecursionTest {

	BinarySearchRecursion r;
	
	@Before
	public void init() {
		r = new BinarySearchRecursion();
	}
	
	@Test
	public void searchTest() {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int index = r.search(array, 8);
		Assert.assertEquals(7, index);
	}
	
	@Test 
	 public void testNotFound() {
	    int[] array = {1,2,3,4,5};
	    int index = r.search(array, 8);
	    Assert.assertEquals(-1, index);
	 
	    index = r.search(array, 0);
	    Assert.assertEquals(-1, index);
	 
	    index = r.search(array, 6);
	    Assert.assertEquals(-1, index);
	}
}
