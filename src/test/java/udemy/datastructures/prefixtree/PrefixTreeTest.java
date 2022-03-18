package udemy.datastructures.prefixtree;

import java.util.Set;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class PrefixTreeTest {
	
	@Test
	public void insertTest() {
		PrefixNode node = new PrefixNode();
		Assert.assertTrue(node.insert("tea", 1L));
		Assert.assertTrue(node.insert("tear", 2L));
		Assert.assertTrue(node.insert("ted", 3L));
		Assert.assertTrue(node.insert("tod", 4L));
	}
	
	@Test
	public void searchTest() {
		PrefixNode node = new PrefixNode();
		node.insert("tea", 10L);
		node.insert("tea", 13L);
		node.insert("ted", 20L);
		node.insert("true", 101L);
		
		Set<Long> ids = node.search("tea");
		Assert.assertArrayEquals(ArrayUtils.toPrimitive(ids.toArray(new Long[1])), new long[]{10,13});
		
		ids = node.search("true");
		Assert.assertArrayEquals(ArrayUtils.toPrimitive(ids.toArray(new Long[1])), new long[]{101});
		
		ids = node.search("ted");
		Assert.assertArrayEquals(ArrayUtils.toPrimitive(ids.toArray(new Long[1])), new long[]{20});
	}
}
