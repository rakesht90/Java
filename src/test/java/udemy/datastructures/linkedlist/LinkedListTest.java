package udemy.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void addTest() {
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(1);
		list.add(3);
		LinkedNode node = list.head;
		Assert.assertEquals(5, node.root);
		node = node.next;
		Assert.assertEquals(1, node.root);
		node = node.next;
		Assert.assertEquals(3, node.root);
		node = node.next;
		Assert.assertNull(node);
	}
}
