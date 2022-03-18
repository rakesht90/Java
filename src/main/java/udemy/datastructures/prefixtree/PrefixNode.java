package udemy.datastructures.prefixtree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrefixNode {

	char root;
	Set<Long> matchingIds;
	Map<Character, PrefixNode> children;
	
	public PrefixNode() {
		
	}

	public PrefixNode(char root) {
		this.root = root;
		this.matchingIds = null;
		this.children = null;
	}
	
	
	public boolean insert(String s, Long id) {
		return insert(s, 0, id);
	}

	private boolean insert(String s, int pos, Long id) {
		if (s == null || s.length() <= 0) return false;
		if (pos >= s.length()) return false;
		
		if (children == null) children = new HashMap<Character, PrefixNode>(s.length());
		
		char c = s.charAt(pos);
		PrefixNode node = children.get(c);
		
		if (node == null) {
			node = new PrefixNode(c);
			children.put(c, node);
		}
		
		if (pos == s.length()-1) {
			if (node.matchingIds == null) node.matchingIds = new HashSet<Long>();
			node.matchingIds.add(id);
			return true;
		} else {
			pos = pos + 1;
			return node.insert(s, pos, id);
		}
	}
	
	public Set<Long> search(String s) {
		return search(s, 0);
	}
	
	private Set<Long> search(String s, int pos) {
		if (s == null || s.length() <= 0) return null;
		if (children == null) return null;
		
		char c = s.charAt(pos);
		PrefixNode node = children.get(c);
		if (node == null) return null;
		if (pos == s.length()-1) return node.matchingIds;
		
		pos = pos + 1;
		return node.search(s, pos);
	}
}
