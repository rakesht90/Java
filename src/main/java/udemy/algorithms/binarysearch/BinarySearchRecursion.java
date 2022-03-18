package udemy.algorithms.binarysearch;

public class BinarySearchRecursion {

	int[] array;
	int key;
	
	public int search(int[] array, int key) {
		this.array = array;
		this.key = key;
		return search(0, array.length-1);
	}
	
	/*
	 * {1,2,3,4,5,6,7,8,9,10}
	 */
	private int search(int low, int high) {
		 int mid = getMidIndex(low, high);
		 
		 if (low > high) return -1;
		 if (key < array[mid]) return search(low, mid-1);
		 else if (key > array[mid]) return search(mid+1, high);
		 else if (key == array[mid]) return mid;
		 else return -1;
	}
	
	int getMidIndex(int low, int high) {
		return low + ((high -low) /2);
	}
}
