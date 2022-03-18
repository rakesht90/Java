package udemy.datastructures.doublylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListTest {

	DoublyLinkedList l;
	
	@Before
	public void init() {
		l = new DoublyLinkedList();
		l.add(5);
		l.add(3);
		l.add(7);
	}
	
	@Test
	public void addTest() {
		Node n = l.getHead();
		Assert.assertEquals(5, n.getRoot());
		
		n = n.getNext();
		Assert.assertEquals(3, n.getRoot());
		
		n = n.getNext();
		Assert.assertEquals(7, n.getRoot());
		
		Assert.assertNull(n.getNext());
		System.out.println(l);
	}
	
	@Test
	public void removeTest() {
		l.remove(3);
		System.out.println(l);
	}
}
