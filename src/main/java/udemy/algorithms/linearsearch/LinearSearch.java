package udemy.algorithms.linearsearch;

/**
 * Linear Search Algorithm
 * 
 * This algorithm searches into an array until the number to be searched matches a value into the array.
 * If no match is found -1 will be returned
 * 
 * @author Marcos
 *
 */
public class LinearSearch {

	/*
	 *  0 1 2 3
	 * {1,2,3,4}
	 */
	public int search(int number, int[] array) {
		for (int x=0; x<array.length; x++) {
			if (array[x] == number) return x;
		}
		return -1;
	}
}
