package udemy.datastructures.stack;

/**
 * Implementation of Stack
 * This class implements Stack using Generics.
 * 
 * <pre>Usage:
 * StackGenerics<Long> s = new StackGenerics<Long>(5);
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
public class StackGenerics<T extends Number> {

	int top;
	T[] array;
	int maxSize;
	
	public StackGenerics(T[] array) {
		this.maxSize = array.length;
		this.array = array;
		this.top = -1;
	}
	
	public void push(T i) throws Exception{
		if (isFull()) throw new Exception("Stack is full");
		top = top + 1;
		array[top] = i;
	}
	
	public T pop() throws Exception {
		if (isEmpty()) throw new Exception("Stack is empty");
		return array[top--];
	}
	
	public T peek() throws Exception {
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
