package udemy.datastructures.doublylinkedlist;

public class Node {

	private int root;
	private Node previews;
	private Node next;
	
	public Node(int root) {
		this.root = root;
	}

	public int getRoot() {
		return root;
	}

	public void setRoot(int root) {
		this.root = root;
	}

	public Node getPreviews() {
		return previews;
	}

	public void setPreviews(Node previews) {
		this.previews = previews;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
