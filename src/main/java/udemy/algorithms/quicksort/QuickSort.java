package udemy.algorithms.quicksort;

/**
 * Quick Sort Algorithm
 * 
 * This algorithm is very fast and widely used. It is suitable for use into large sets of data.
 * Average time of execution is O(n log n)
 * 
 * It divides the array in swap the elements in a way that the elements lower than the pivot
 * goes to the left and the elements higher than the pivot goes to the right side of the pivot.
 * 
 * @author Marcos
 */
public class QuickSort {

	public int[] sort(int[] array) {
		return sort(array, 0, array.length -1);
	}
	
	private int[] sort(int[] array, int low, int high) {
		int initLow = low;
		int initHigh = high;
		int mid = low + ((high - low) /2);
		int pivot = array[mid];
		while(low <= high) {
			while (array[low] < pivot) low++;
			while (array[high] > pivot) high--;
			
			if (low <= high) {
				swap(array, low, high);
				low++;
				high--;
			}
		}
		if (initLow < high) sort(array, initLow, high);
		if (low < initHigh) sort(array, low, initHigh);
		return array;
	}

	private void swap(int[] array, int low, int high) {
		int temp = array[low];
		array[low] = array[high];
		array[high] = temp;
	}
}
