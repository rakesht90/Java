package udemy.algorithms.binarysearch;

/**
 * Binary Search Algorithm
 * 
 * This algorithm implements the technique of divide and conquer.
 * It will return the index into the array that matched the key in case it is found
 * It will return -1 in case of not found
 * 
 * @author Marcos
 */
public class BinarySearch {

	/*
	 * {1,2,3,4,5,6,7,8,9,10}
	 */
	public int search(int[] array, int key) {
		int low = 0;
		int high = array.length -1;
		while (low <= high) {
			int mid = getMiddleIndex(low, high);
			
			if (key < array[mid]) high = mid - 1;
			else if (key > array[mid]) low = mid +1;
			else return mid;
		}
		return -1;
	}
	
	private int getMiddleIndex(int low, int high) {
		return ((high - low) /2);
	}
}
