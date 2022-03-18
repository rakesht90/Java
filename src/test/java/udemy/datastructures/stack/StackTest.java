package udemy.datastructures.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	@Test
	public void pushTest() throws Exception {
		Stack s = new Stack(3);
		s.push(new Integer("3"));
		s.push(new Integer("33"));
		s.push(new Integer("10"));
		Assert.assertEquals(new Integer("10"), s.peek());
		Assert.assertEquals(3, s.size());
		Assert.assertFalse(s.isEmpty());
		Assert.assertTrue(s.isFull());
	}
	
	@Test
	public void popTest() throws Exception {
		Stack s = new Stack(3);
		s.push(new Integer("3"));
		s.push(new Integer("33"));
		s.push(new Integer("10"));
		
		s.pop();
		Assert.assertEquals(new Integer("33"), s.peek());
	}
	
	@Test
	public void multipleObjectTypesTest() throws Exception {
		Stack s = new Stack(2);
		s.push(new Integer("3"));
		s.push(new Long("4"));
		Assert.assertEquals(2, s.size());
		Assert.assertTrue(s.pop() instanceof Long);
		Assert.assertTrue(s.pop() instanceof Integer);
	}
}
