package udemy.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeNodeTest {

	TreeNode node;
	
	@Before
	public void init() {
		node = new TreeNode(7);
		node.addNode(5);
		node.addNode(1);
		node.addNode(10);
		node.addNode(17);
		node.addNode(9);
		node.addNode(6);
	}
	
	@Test
	public void testPreorderTraversal() {
		List<Integer> list = new ArrayList<Integer>(7);
		node.preOrderTraversal(list);
//		System.out.println(Arrays.toString(list.toArray(new Integer[1])));
		
		int[] expected = {1,5,6,7,9,10,17};
		int[] actual = ArrayUtils.toPrimitive(list.toArray(new Integer[1]));
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void postOrderTraversal() {
		List<Integer> list = new ArrayList<Integer>(7);
		node.postOrderTraversal(list);
//		System.out.println(Arrays.toString(list.toArray(new Integer[1])));
		
		int[] expected = {17,10,9,7,6,5,1};
		int[] actual = ArrayUtils.toPrimitive(list.toArray(new Integer[1]));
		Assert.assertArrayEquals(expected, actual);
		
	}
}
