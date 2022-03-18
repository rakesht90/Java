package udemy.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

	BinarySearch b;
	
	@Before
	public void init() {
		b = new BinarySearch();
	}
	
	@Test
	public void searchTest() {
		int[] array = createArray(1000);
		
		int index = b.search(array, 762);
		Assert.assertEquals(761, index);
		
		index = b.search(array, 3);
		Assert.assertEquals(2, index);
	}
	
	@Test 
	public void testNotFound() {
		int[] array = {1,2,3,4,5};
		int index = b.search(array, 8);
		Assert.assertEquals(-1, index);
	}
	
	public int[] createArray(int max) {
		int[] array = new int[max];
		for(int x=0; x<max; x++) {
			array[x] = x+1;
		}
		return array;
	}
}
