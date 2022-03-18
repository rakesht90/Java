package udemy.algorithms.quicksort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {

	QuickSort q;
	
	@Before
	public void init() {
		q = new QuickSort();
	}
	
	@Test
	public void sortTest() {
		int[] expected = {1,2,5,7,10};
		int[] array = {7,1,5,10,2};
		
		array = q.sort(array);
		Assert.assertArrayEquals(expected, array);
	}
}
