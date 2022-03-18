package udemy.datastructures.stack;

/**
 * Implementation of Stack
 * This class implements Stack with an array of Objects.
 * 
 * <pre>Usage:
 * Stack s = new Stack(5);
 * s.push(new Long("3"));
 * s.push(new Long("1"));
 * 
 * s.pop();
 * 
 * s.peek();
 * 
 * </pre>
 * @author Marcos
 *
 */
public class Stack {

	int top;
	Object[] array;
	int maxSize;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.array = new Object[maxSize];
		this.top = -1;
	}
	
	public void push(Object i) throws Exception{
		if (isFull()) throw new Exception("Stack is full");
		top = top + 1;
		array[top] = i;
	}
	
	public Object pop() throws Exception {
		if (isEmpty()) throw new Exception("Stack is empty");
		return array[top--];
	}
	
	public Object peek() throws Exception {
		if (isEmpty()) throw new Exception("Stack is empty");
		return array[top];
	}
	
	public int size() {
		return ( top + 1 );
	}

	public boolean isEmpty() {
		return (top < 0);
	}
	
	public boolean isFull() {
		return (top + 1 >= maxSize);
	}
}
