package udemy.interview.longestsequence;

import org.junit.Assert;
import org.junit.Test;

public class LongestSequenceTest {


	@Test
	public void findTest() {
		LongestSequence l = new LongestSequence();
		int result = l.find("badcabcdd");
		Assert.assertTrue(result == 4);
		Assert.assertEquals("b,a,d,c", l.getLongestSequence());
		
		result = l.find("zabcad");
		Assert.assertTrue(result == 4);
		Assert.assertEquals("z,a,b,c", l.getLongestSequence());
		
		result = l.find("azsdbcabcde");
		Assert.assertTrue(result == 6);
		Assert.assertEquals("a,z,s,d,b,c", l.getLongestSequence());
	}
	
	@Test
	public void testChar() {
		System.out.println((int) 'b');
		System.out.println((int) 'B');
		System.out.println((int) 'Z');
	}
}
