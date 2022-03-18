package udemy.datastructures.stack;

import org.junit.Assert;
import org.junit.Test;


public class StackGenericsTest {

	
	@Test
	public void stackTest() throws Exception {
		StackGenerics<Integer> s = new StackGenerics<Integer>(new Integer[3]);
		s.push(new Integer("3"));
		s.push(new Integer("4"));
		s.push(4);
		Assert.assertEquals(3, s.size());
		
		Integer i = s.pop();
		Assert.assertEquals(2, s.size());
		Assert.assertTrue(i.intValue() == 4);
	}
}
