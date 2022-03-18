package udemy.datastructures.linkedlist;

public class LinkedNode {

	public int root;
	public LinkedNode next;
	
	public LinkedNode(int root) {
		this.root = root;
	}
	
	@Override
	public String toString() {
		return "root:" + root;
	}
}
