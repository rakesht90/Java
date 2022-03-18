package udemy.algorithms.insertsort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertSortTest {

	InsertSort i;
	
	@Before
	public void init() {
		i = new InsertSort();	
	}
	
	@Test
	public void swapTest() {
		int[] array = {3,5,2,1};
		i.swap(array, 1, 2);
		int[] expectedArray = {3,2,5,1};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	@Test
	public void sortTest() {
		int[] array = {3,7,10,13,2,6,5,1};
		int[] expected = {1,2,3,5,6,7,10,13};
		array = i.sort(array);
		Assert.assertArrayEquals(expected, array);
	}
	
	@Test
	public void sortRepetedNumbersTest() {
		int[] array = {3,7,13,13,2,7,1,1};
		int[] expected = {1,1,2,3,7,7,13,13};
		array = i.sort(array);
		Assert.assertArrayEquals(expected, array);
	}
}
