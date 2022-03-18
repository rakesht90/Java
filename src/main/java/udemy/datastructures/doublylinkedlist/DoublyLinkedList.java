package udemy.datastructures.doublylinkedlist;

/**
 * Implementation of Doubly Linked List
 * It implements previous and next and the root element is int
 * 
 * @author Marcos
 */
public class DoublyLinkedList {

	private Node head;
	
	public Node getHead() {
		return head;
	}
	
	public void add(int root) {
		Node newNode = new Node(root);
		
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.getNext() != null) current = current.getNext();
			newNode.setPreviews(current);
			current.setNext(newNode);
		}
	}

	/**
	 * Remove a record with the root that matched the parameter received.
	 * e.g.
	 * {5, 1, 7}
	 * 5->1  5<-1->7 1<-7
	 * 5->7  5<-7
	 * 
	 * @param root
	 * @return
	 */
	public boolean remove(int root) {
		if (head == null) return false;
		
		Node current = head;
		while(current.getNext() != null) {
			if (current.getRoot() == root) return rearrangeObjects(current);
			current = current.getNext();
		}
		if (current.getRoot() == root)  return rearrangeObjects(current);
		return false;
	}
	
	public boolean rearrangeObjects(Node current) {
		if (current.getPreviews() != null){
			current.getPreviews().setNext(current.getNext());
		}
		if (current.getNext() != null) {
			current.getNext().setPreviews(current.getPreviews());
		}
		return true;
	}
	
	@Override
	public String toString() {
		Node current = head;
		
		StringBuilder toReturn = new StringBuilder();
		toReturn.append(current.getRoot());
		while(current.getNext() != null) {
			toReturn.append("->").append(current.getNext().getRoot());
			current = current.getNext();
		}
		return toReturn.toString(); 
	}
}
