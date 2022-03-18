package udemy.datastructures.linkedlist;

/**
 * Implementation of LinkedList
 * This has only next object not previous.
 * 
 * @author Marcos
 */
public class LinkedList {

	public LinkedNode head;
	
	/**
	 * This method adds an element into the
	 * 
	 * @param newRoot
	 */
	public void add(int newRoot) {
		LinkedNode newNode = new LinkedNode(newRoot);
		if (head == null) {
			head = newNode;
		} else {
			LinkedNode currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

}
