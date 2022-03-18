package udemy.interview.oddnumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddNumberTest {

	OddNumber o;
	
	@Before
	public void init() {
		o = new OddNumber();
	}
	
	@Test
	public void printTest() {
		Assert.assertEquals("1,3,5,7,9,11", o.print(11));
		Assert.assertEquals("1,3,5,7,9", o.print(10));
		Assert.assertEquals("1", o.print(1));
		Assert.assertEquals("", o.print(0));
	}
	
	@Test
	public void printNoModuleTest() {
		Assert.assertEquals("1,3,5,7,9,11", o.printNoModule(11));
		Assert.assertEquals("1,3,5,7,9", o.printNoModule(10));
		Assert.assertEquals("1", o.printNoModule(1));
		Assert.assertEquals("", o.printNoModule(0));
	}
}
